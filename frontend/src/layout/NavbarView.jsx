import "./navbar.css";

export function NavbarView(props) {
  return (
    <nav className="nav">
      <a href={props.findRoute}>
        <h3>Scania Hub</h3>
      </a>
      <ul id="navbar">
        <li>
          <a href={props.findRoute}>Find</a>
        </li>

        <li>
          <a href={props.compareRoute}>Compare</a>
        </li>
      </ul>
    </nav>
  );
}

export default NavbarView;
