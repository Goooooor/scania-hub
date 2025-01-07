import Button from "@mui/material/Button";
import "./sidebarFilter.css";

export function SidebarFilterView(props) {
  return (
    <div className="search-panel">
      <h3>Find Vehicles</h3>

      <div className="search-field">
        <div className="filter-group">
          <label htmlFor="category">Category</label>
          <select
            id="category"
            value={props.selectedCategory}
            onChange={props.onCategoryChange}
          >
            <option value="Buses">Buses</option>
            <option value="Trucks">Trucks</option>
          </select>
        </div>
      </div>

      {props.selectedCategory === "Trucks" ? (
        <div className="search-field">
          <div className="filter-group">
            <label htmlFor="series">Series</label>
            <select
              id="series"
              value={props.selectedTruckSeries}
              onChange={props.onTruckSeriesChange}
            >
              <option value="ANY">Any</option>
              <option value="L_SERIES">L</option>
              <option value="P_SERIES">P</option>
              <option value="G_SERIES">G</option>
              <option value="R_SERIES">R</option>
              <option value="S_SERIES">S</option>
              <option value="XT_RANGE">XT</option>
            </select>
          </div>
        </div>
      ) : (
        <div className="search-field">
          <div className="filter-group">
            <label htmlFor="series">Series</label>
            <select
              id="series"
              value={props.selectedBusSeries}
              onChange={props.onBusSeriesChange}
            >
              <option value="ANY">Any</option>
              <option value="CAPITOL">Capitol</option>
              <option value="CF_SERIES">CF</option>
              <option value="CITYWIDE">Citywide</option>
              <option value="FENCER">Fencer</option>
              <option value="INTERLINK">Interlink</option>
              <option value="IRIZAR">Irizar</option>
              <option value="K_SERIES">K</option>
              <option value="MAXCI">Maxci</option>
              <option value="METROPOL">Metropol</option>
              <option value="METROLINK">Metrolink</option>
              <option value="N_SERIES">N</option>
              <option value="OMNICITY">Omnicity</option>
              <option value="OMNIEXPRESS">Omniexpress</option>
              <option value="OMNILINE">Omniline</option>
              <option value="OMNILINK">Omnilink</option>
              <option value="TOURING">Touring</option>
            </select>
          </div>
        </div>
      )}

      <div className="filter-group">
        <div className="check-box">
          <label htmlFor="automatic">Automatic</label>
          <input
            type="checkbox"
            id="automatic"
            checked={props.automatic}
            onChange={props.onAutomaticChange}
          />
        </div>
        <div className="check-box">
          <label htmlFor="inProduction">In production</label>
          <input
            type="checkbox"
            id="inProduction"
            checked={props.inProduction}
            onChange={props.onProductionChange}
          />
        </div>
        <div className="check-box">
          <label htmlFor="electric">Electric</label>
          <input
            type="checkbox"
            id="electric"
            checked={props.electric}
            onChange={props.onElectricChange}
          />
        </div>
      </div>

      <Button
        variant="contained"
        onClick={props.onSearch}
        sx={{
          backgroundColor: "#0b204d",
          "&:hover": {
            backgroundColor: "#142c5e"
          },
          top: "25px"
        }}
      >
        Search
      </Button>
    </div>
  );
}

export default SidebarFilterView;
