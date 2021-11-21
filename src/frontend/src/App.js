import './App.css';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import ListStudentComponent from "./components/ListStudentComponent";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";

function App() {
    return (
        <div>
            <Router>
                <HeaderComponent/>
                <div className="container">
                    <Routes>
                        <Route exact path="/" element={<ListStudentComponent/>}/>
                        <Route exact path="/students" element={<ListStudentComponent/>}/>
                    </Routes>
                </div>
                <FooterComponent/>
            </Router>
        </div>
    );
}

export default App;
