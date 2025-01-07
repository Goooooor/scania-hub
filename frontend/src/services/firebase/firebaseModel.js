import { initializeApp } from "firebase/app";
import { getDatabase, ref, get, set } from "firebase/database";
import { firebaseConfig } from "./firebaseConfig";
import { runInAction } from "mobx";

// Initialize Firebase
const app = initializeApp(firebaseConfig);

const realtimeDB = getDatabase(app);
const PATH = "scania-hub";

export function modelToPersistence(model) {
  return {
    find_vehicles: model.vehicles,
    compare_vehicles: model.compareVehicles
  };
}

export function persistenceToModel(firebaseData, model) {
  return new Promise((resolve) => {
    runInAction(() => {
      // Mobx allows changes with runInAction
      if (!firebaseData) {
        model.vehicles = [];
        model.compareVehicles = [];
      } else {
        model.vehicles = firebaseData.find_vehicles || [];
        model.compareVehicles = firebaseData.compare_vehicles || [];
      }
    });

    resolve(model);
  });
}

export function readFromFirebase(model) {
  // Set to not ready so model doesnt get saved while loading from fb ("pause")
  model.ready = false;
  const refr = ref(realtimeDB, PATH);

  return (
    get(refr)
      //Snapshot is data from path in fb
      .then((snapshot) => {
        return persistenceToModel(snapshot.val(), model);
      })
      .then(() => {
        // Once we have fetched and processed data into model, persistenceToModel, set back to true, ready to use
        model.ready = true;
      })
  );
}

export function saveToFirebase(model) {
  const refr = ref(realtimeDB, PATH);
  //console.log("Saving");
  if (model.ready) {
    //console.log("ready, setting");
    set(refr, modelToPersistence(model));
  }
}

//Monitors changes
export function connectToFirebase(model, watchFunction) {
  // What we observe for changes
  function observeACB() {
    //console.log("Observing");
    //console.log(model.vehicles, model.compareVehicles, "vehicles");
    return [model.vehicles, model.compareVehicles];
  }

  //What effect we want when above has been changed
  function sideEffectACB() {
    saveToFirebase(model);
    //console.log("Sideeffect");
  }

  readFromFirebase(model).then(() => {
    watchFunction(observeACB, sideEffectACB);
  });
}

export default {
  connectToFirebase,
  modelToPersistence,
  persistenceToModel,
  saveToFirebase,
  readFromFirebase
};
