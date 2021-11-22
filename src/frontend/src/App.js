import './App.css';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import ListStudentComponent from "./components/ListStudentComponent";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import AddStudentComponent from "./components/AddStudentComponent";

function App() {
    return (
        <div>
            <Router>
                <HeaderComponent/>
                <div className="container">
                    <Routes>
                        <Route exact path="/" element={<ListStudentComponent/>}/>
                        <Route path="/students" element={<ListStudentComponent/>}/>
                        <Route path="/add-student" element={<AddStudentComponent/>}/>
                    </Routes>
                </div>
                <FooterComponent/>
            </Router>
        </div>
    );
}

export default App;
