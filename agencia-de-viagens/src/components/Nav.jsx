import React from "react";
import { Link } from "react-router-dom";
import './assets/css/style.css'



export default function Menu() {
    return (

<nav class="navbar navbar-expand-lg navbar-light bg-light">
<Link to="/"><img src="imagens/logo.png" alt="logo"/></Link>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <Link class="nav-item nav-link active" to="/">Home <span class="sr-only">(current)</span></Link>
      <Link class="nav-item nav-link" to="/Destinos">Destinos</Link>
      <Link class="nav-item nav-link" to="/Promocoes">Promoções</Link>
      <Link class="nav-item nav-link" to="/Contato">Contato</Link>
     
    </div>
  </div>
</nav>


 
    );
}
