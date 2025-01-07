import "./find.css";
import VehicleCard from "../components/Card";

function FindPageView(props) {
  if (!props.ready) {
    return (
      <div className="find">
        <img src="src/assets/spinner.svg" alt="Loading..." />
      </div>
    );
  }

  if (props.vehicles.length === 0) {
    return (
      <div className="find">
        <p1>
          No vehicles found. Use the search panel to find and display vehicles.
        </p1>
      </div>
    );
  }

  return (
    <div className="find-container">
      <div className="find">
        {props.vehicles.map((vehicle, i) => (
          <VehicleCard
            key={i}
            {...vehicle}
            isAdded={props.isAdded(vehicle)}
            addOrRemoveFromCompare={() => props.addOrRemoveFromCompare(vehicle)}
            compareVehicles={props.compareVehicles}
          />
        ))}
      </div>
    </div>
  );
}

export default FindPageView;
