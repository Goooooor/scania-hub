import { observer } from "mobx-react-lite";
import NavbarView from "./NavbarView";

const Navbar = observer(function NavbarRender(props) {
  //Must use variables, cant directly pass string in props
  const homeRoute = "/home";
  const findRoute = "/find";
  const compareRoute = "/compare";

  return (
    <NavbarView
      findRoute={findRoute}
      compareRoute={compareRoute}
      homeRoute={homeRoute}
    ></NavbarView>
  );
});

export { Navbar };
