import { createRoot } from "react-dom/client";
import AppRoutes from "./AppRoutes.jsx";
import model from "./services/scania-model.js";
import { observable } from "mobx";
import { connectToFirebase } from "./services/firebase/firebaseModel.js";
import { reaction } from "mobx";

const reactiveModel = observable(model);
connectToFirebase(reactiveModel, reaction);

createRoot(document.getElementById("root")).render(
  <AppRoutes model={reactiveModel}></AppRoutes>
);
