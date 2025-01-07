import { observer } from "mobx-react-lite";
import ComparePageView from "./ComparePageView";
import { useState } from "react";

const Compare = observer(function ComparePageRenderer(props) {
  const [selectedRows, setSelectedRows] = useState([]);

  function handleRemoveSelectedACB() {
    props.model.compareVehicles = props.model.compareVehicles.filter(
      (vehicle) => !selectedRows.includes(vehicle.id)
    );
    setSelectedRows([]);
  }

  async function handleMakeSearchACB() {
    await props.model.search();
    setSelectedRows([]);
  }

  return (
    <ComparePageView
      rows={props.model.getCompareVehiclesWithIds()}
      onRemoveSelected={handleRemoveSelectedACB}
      compareVehicles={props.model.compareVehicles}
      selectedRows={selectedRows}
      onSelectionChange={(ids) => setSelectedRows(ids)}
      ready={props.model.ready}
      getAllVehicles={handleMakeSearchACB}
    />
  );
});

export default Compare;
