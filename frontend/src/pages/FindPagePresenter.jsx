import { observer } from "mobx-react-lite";
import SidebarFilterView from "../layout/SidebarFilterView";
import FindPageView from "./FindPageView";
import { useState } from "react";

const Find = observer(function FindPageRenderer(props) {
  const [category, setCategory] = useState("Buses");
  const [busSeries, setBusSeries] = useState("ANY");
  const [truckSeries, setTruckSeries] = useState("ANY");
  const [automatic, setAutomatic] = useState(false);
  const [production, setProduction] = useState(false);
  const [electric, setElectric] = useState(false);

  const filters = {
    type: category,
    series: category === "Trucks" ? truckSeries : busSeries,
    automatic: automatic,
    inProduction: production,
    electric: electric
  };

  function handleCategoryChangeACB(event) {
    setCategory(event.target.value);
  }

  function handleBusSeriesChangeACB(event) {
    setBusSeries(event.target.value);
  }

  function handleTruckSeriesChangeACB(event) {
    setTruckSeries(event.target.value);
  }

  function handleAutomaticChangeACB(event) {
    setAutomatic(event.target.checked);
  }

  function handleProductionChangeACB(event) {
    setProduction(event.target.checked);
  }

  function handleElectricChangeACB(event) {
    setElectric(event.target.checked);
  }

  async function handleMakeSearchACB() {
    await props.model.search(filters);
  }

  function isAddedACB(vehicle) {
    return props.model.compareVehicles.some((v) => v.model === vehicle.model);
  }

  // Delegate add or remove logic to the model
  function handleAddOrRemoveACB(vehicle) {
    props.model.addOrRemoveFromCompare(vehicle);
  }

  return (
    <div>
      <SidebarFilterView
        selectedCategory={category}
        selectedBusSeries={busSeries}
        selectedTruckSeries={truckSeries}
        onCategoryChange={handleCategoryChangeACB}
        onBusSeriesChange={handleBusSeriesChangeACB}
        onTruckSeriesChange={handleTruckSeriesChangeACB}
        automatic={automatic}
        inProduction={production}
        electric={electric}
        onAutomaticChange={handleAutomaticChangeACB}
        onProductionChange={handleProductionChangeACB}
        onElectricChange={handleElectricChangeACB}
        onSearch={handleMakeSearchACB}
      />
      <FindPageView
        vehicles={props.model.vehicles}
        compareVehicles={props.model.compareVehicles}
        isAdded={isAddedACB}
        addOrRemoveFromCompare={handleAddOrRemoveACB}
        ready={props.model.ready}
      />
    </div>
  );
});

export default Find;
