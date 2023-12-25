import logo from './logo.svg'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import Navbar from './layout/Navbar'
import Workers from './worker/Workers'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'

function App () {
  return (
    <div className='App'>
      <Router>
        <Navbar />
        <Routes>
          <Route exact path='/worker/all' element={<Workers />}></Route>
        </Routes>
      </Router>
    </div>
  )
}

export default App
