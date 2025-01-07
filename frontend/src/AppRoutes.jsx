import "./app.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import { Navbar } from "./layout/NavbarPresenter.jsx";
import Find from "./pages/FindPagePresenter.jsx";
import { observer } from "mobx-react-lite";
import Compare from "./pages/ComparePagePresenter.jsx";

function createRouter(model) {
  return createBrowserRouter([
    {
      path: "/",
      element: <Find model={model} />
    },
    {
      path: "/find",
      element: <Find model={model} />
    },
    {
      path: "/compare",
      element: <Compare model={model} />
    }
  ]);
}
const AppRoutes = observer(function AppRoutesRender(props) {
  const router = createRouter(props.model);
  return (
    <div className="app">
      <div>
        <Navbar model={props.model}></Navbar>
      </div>
      <div>
        <RouterProvider router={router}></RouterProvider>
      </div>
    </div>
  );
});

export default AppRoutes;
