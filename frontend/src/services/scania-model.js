import fetchVehicles from "./api/api-scania";

const model = {
  ready: null,
  vehicles: [],
  compareVehicles: [],

  async search(paramObject) {
    if (paramObject) {
      this.vehicles = await fetchVehicles(paramObject);
    } else {
      const newVehicles = await fetchVehicles();
      this.compareVehicles = [...newVehicles];
    }
  },

  addOrRemoveFromCompare(vehicle) {
    const foundVehicle = this.compareVehicles.find(
      (v) => v.model === vehicle.model
    );

    if (!foundVehicle) {
      this.compareVehicles = [...this.compareVehicles, vehicle];
    } else {
      this.compareVehicles = this.compareVehicles.filter(
        (v) => v.model !== vehicle.model
      );
    }
  },

  getCompareVehiclesWithIds() {
    return this.compareVehicles.map((vehicle) => ({
      id: vehicle.model,
      ...vehicle
    }));
  }
};

export default model;
