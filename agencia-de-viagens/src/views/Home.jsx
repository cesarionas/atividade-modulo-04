import React from "react";

export default function Home() {
  return (
    <>
      <>
        <h1>Principais destinos internacionais dessa temporada</h1>
      </>

      <div
        id="carouselExampleIndicators"
        class="carousel slide"
        data-ride="carousel"
      >
        <ol class="carousel-indicators">
          <li
            data-target="#carouselExampleIndicators"
            data-slide-to="0"
            class="active"
          ></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img class="d-block w-100" src="imagens/1.png" alt="Promo" />
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="imagens/4.png" alt="França" />
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="imagens/3.png" alt="Holanda" />
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="imagens/5.png" alt="Inglaterra" />
          </div>
        </div>
        <a
          class="carousel-control-prev"
          href="#carouselExampleIndicators"
          role="button"
          data-slide="prev"
        >
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Anterior</span>
        </a>
        <a
          class="carousel-control-next"
          href="#carouselExampleIndicators"
          role="button"
          data-slide="next"
        >
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Proximo</span>
        </a>
      </div>
    </>
  );
}
