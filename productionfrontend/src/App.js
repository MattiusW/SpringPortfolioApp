import logo from './logo.svg';
import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar';
import Workers from './worker/Workers';

function App() {
  return (
    <div className="App">
     <Navbar />
     <Workers />
    </div>
  );
}

export default App;
