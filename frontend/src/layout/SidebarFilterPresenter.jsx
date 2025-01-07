import { observer } from "mobx-react-lite";
import SidebarFilterView from "./SidebarFilterView";
import { useState } from "react";

const SidebarFilter = observer(function SidebarFilterRender(props) {
  return <SidebarFilterView></SidebarFilterView>;
});

export { SidebarFilter };
