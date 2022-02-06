import { BrowserRouter, Routes, Route } from "react-router-dom"; 

import Menu from "./components/Nav";

import Home from "./views/Home";
import Destinos from "./views/Destinos";
import Promocoes from "./views/Promocoes";
import Contato from "./views/Contato";

import Footer from "./components/Footer";

function App() {
  return (
    <BrowserRouter>
      <Menu />
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/Destinos" element={<Destinos/>} />
        <Route path="/Promocoes" element={<Promocoes/>} />
        <Route path="/Contato" element={<Contato/>} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;