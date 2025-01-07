import * as React from "react";
import { DataGrid } from "@mui/x-data-grid";
import Paper from "@mui/material/Paper";
import { Button, Typography, Box } from "@mui/material";
import "./compare.css";

function ComparePageView(props) {
  // Show the loading spinner if data is still loading
  if (props.ready === false) {
    return (
      <div className="compare">
        <img src="src/assets/spinner.svg" alt="Loading..." />
      </div>
    );
  }

  const columns = [
    { field: "type", headerName: "Type", width: 100 },
    { field: "series", headerName: "Series", width: 160 },
    { field: "model", headerName: "Model", width: 160 },
    {
      field: "automatic",
      headerName: "Automatic",
      width: 120,
      valueGetter: (value, row) => (row.automatic ? "YES" : "NO")
    },
    {
      field: "inProduction",
      headerName: "In Production",
      width: 150,
      valueGetter: (value, row) => (row.inProduction ? "YES" : "NO")
    },
    {
      field: "engineType",
      headerName: "Engine Type",
      width: 150,
      valueGetter: (value, row) => row.engine?.type || "N/A"
    },
    {
      field: "horsepower",
      headerName: "Horsepower (HP)",
      width: 180,
      valueGetter: (value, row) => row.engine?.horsepower || "N/A"
    },
    {
      field: "batteryCapacity",
      headerName: "Battery Capacity (kWh)",
      width: 200,
      valueGetter: (value, row) => row.battery?.capacity || "N/A"
    }
  ];

  return (
    <Paper sx={{ height: "93vh", width: "100%", overflow: "hidden" }}>
      {/* Buttons Section */}
      <Box
        sx={{
          display: "flex",
          justifyContent: "space-between",
          alignItems: "center",
          padding: "10px"
        }}
      >
        <Typography variant="h6" sx={{ fontWeight: "bold", color: "#333" }}>
          Compare Vehicles
        </Typography>
        <Box>
          {/* Remove selected button */}
          <Button
            variant="contained"
            color="error"
            onClick={props.onRemoveSelected}
            disabled={props.selectedRows.length === 0}
            sx={{ marginRight: "10px" }}
          >
            Remove Selected
          </Button>

          {/* Add all vehicles button */}
          <Button
            variant="contained"
            color="primary"
            onClick={props.getAllVehicles}
          >
            Add all vehicles
          </Button>
        </Box>
      </Box>{" "}
      {/* Adjusted height */}
      <DataGrid
        disableVirtualization
        rows={props.rows}
        columns={columns}
        pageSizeOptions={[8, 18, 27, 36, 45, 54, 63, 72, 81, 90]}
        initialState={{
          pagination: { paginationModel: { page: 0, pageSize: 8 } }
        }}
        checkboxSelection
        onRowSelectionModelChange={props.onSelectionChange}
        rowHeight={56}
        sx={{
          border: 0,
          height: "calc(100% - 62px)",
          backgroundColor: "#ffffff",
          "& .MuiDataGrid-columnHeaders": {
            backgroundColor: "#f0f0f0",
            fontWeight: "bold",
            fontSize: "1rem"
          },
          "& .MuiDataGrid-row": {
            "&:nth-of-type(odd)": { backgroundColor: "#fafafa" }
          },
          "& .MuiDataGrid-footerContainer": {
            backgroundColor: "#f0f0f0",
            height: "40px"
          }
        }}
      />
    </Paper>
  );
}

export default ComparePageView;
