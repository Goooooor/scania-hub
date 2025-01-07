/*
    This component is heavily inspired by the MUI card (React component library)
*/
import React from "react";
import Card from "@mui/material/Card";
import CardContent from "@mui/material/CardContent";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import Box from "@mui/material/Box";

function VehicleCard(props) {
  const type = props.type;
  const series = props.series;
  const model = props.model;
  const automatic = props.automatic;
  const inProduction = props.inProduction;
  const engineType = props.engine.type;
  const horsepower = props.engine.horsepower;
  const batteryCapacity = props.battery.capacity;

  return (
    <Card
      sx={{
        maxWidth: 300,
        margin: "16px",
        padding: "16px",
        borderRadius: "12px",
        boxShadow: "0 4px 10px rgba(0, 0, 0, 0.1)",
        backgroundColor: "#f5f5f5",
        transition: "transform 0.2s ease-in-out",
        "&:hover": {
          transform: "scale(1.05)"
        }
      }}
    >
      <CardContent>
        {/* Type */}
        <Typography
          sx={{
            fontSize: "1.2rem",
            fontWeight: "bold",
            color: "#0d1e43",
            textAlign: "center",
            marginBottom: "16px"
          }}
        >
          {type}
        </Typography>

        {/* Info rows */}
        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            Series:
          </Typography>
          <Typography>{series}</Typography>
        </Box>

        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            Model:
          </Typography>
          <Typography>{model}</Typography>
        </Box>

        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            Automatic:
          </Typography>
          <Typography>{automatic === true ? "YES" : "NO"} </Typography>
        </Box>

        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            In production:
          </Typography>
          <Typography>{inProduction === true ? "YES" : "NO"} </Typography>
        </Box>

        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            Engine Type:
          </Typography>
          <Typography>{engineType}</Typography>
        </Box>

        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            Horsepower:
          </Typography>
          <Typography>{horsepower} hp</Typography>
        </Box>

        <Box sx={{ marginBottom: "8px" }}>
          <Typography sx={{ fontWeight: "bold", color: "#555" }}>
            Battery Capacity:
          </Typography>
          <Typography>{batteryCapacity} kWh</Typography>
        </Box>
      </CardContent>

      {/* Add to compare button */}
      <Box
        sx={{
          display: "flex",
          justifyContent: "center",
          marginTop: "16px"
        }}
      >
        <Button
          onClick={props.addOrRemoveFromCompare}
          variant="contained"
          sx={{
            backgroundColor: props.isAdded ? "#d32f2f" : "#0b204d",
            "&:hover": {
              backgroundColor: props.isAdded ? "#b71c1c" : "#142c5e"
            },
            textTransform: "none",
            padding: "8px 16px"
          }}
        >
          {props.isAdded ? "Remove from Compare" : "Add to Compare"}
        </Button>
      </Box>
    </Card>
  );
}

export default VehicleCard;
