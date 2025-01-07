import { v4 as uuidv4 } from "uuid";
import {
  BASE_URL,
  TRUCK_ENDPOINT,
  BUS_ENDPOINT,
  VEHICLE_ENDPOINT
} from "./api-config";

console.log(BASE_URL + TRUCK_ENDPOINT);

export async function fetchVehicles(paramObject) {
  const queryString = new URLSearchParams();
  let url = `${BASE_URL}`;

  console.log("in api ", paramObject);

  if (paramObject) {
    if (paramObject.series && paramObject.series !== "ANY") {
      queryString.append("series", paramObject.series);
    }

    if (paramObject.automatic) {
      queryString.append("automatic", paramObject.automatic);
    }

    if (paramObject.inProduction) {
      queryString.append("production", paramObject.inProduction);
    }

    if (paramObject.electric === true) {
      queryString.append("engine", "electric");
    }

    url +=
      paramObject.type === "Buses"
        ? `${BUS_ENDPOINT}?${queryString}`
        : `${TRUCK_ENDPOINT}?${queryString}`;
  } else {
    url += `${VEHICLE_ENDPOINT}`;
  }

  console.log(url);

  const options = {
    method: "GET",
    headers: {
      "Content-Type": "application/json"
    }
  };

  try {
    const response = await fetch(url);
    if (!response.ok) throw new Error(`Fetch failed: ${response.status}`);

    const data = await response.json();

    return data.map((vehicle) => ({
      ...vehicle,
      id: uuidv4()
    }));
  } catch (error) {
    console.error("Error fetching vehicles:", error);
    return [];
  }
}

export default fetchVehicles;
