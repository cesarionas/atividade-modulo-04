import { render } from "@testing-library/react";
import React from "react";
import "./css/Destino.css";

export default class Destinos extends React.Component {
  constructor(props) {
    super(props);

    this.exibir_categoria = this.exibir_categoria.bind(this);
    this.exibir_todos = this.exibir_todos.bind(this);
  }

  exibir_categoria(categorias) {
    let elementos = document.getElementsByClassName("produto");
    console.log(elementos);
    for (var i = 0; i < elementos.length; i++) {
      console.log(elementos[i].id);
      if (categorias == elementos[i].id)
        elementos[i].style = "display:inline-block";
      else elementos[i].style = "display:none";
    }
  }

  exibir_todos() {
    let elementos = document.getElementsByClassName("produto");

    for (var i = 0; i < elementos.length; i++) {
      elementos[i].style = "";
    }
  }

  render() {
    return (
      <div>
        <h1>Nossos Destinos</h1>
        <div class="selecao">
          <div class="continentes">
            <section class="paises">
              <h3>Destinos</h3>
              <ul>
                <li onClick={() => this.exibir_todos()}>Todos (16)</li>
                <li onClick={() => this.exibir_categoria("europa")}>
                  Europa (8)
                </li>
                <li onClick={() => this.exibir_categoria("ams")}>
                  América do Sul (3)
                </li>
                <li onClick={() => this.exibir_categoria("amn")}>
                  América do Norte (2){" "}
                </li>
                <li onClick={() => this.exibir_categoria("africa")}>
                  África (3){" "}
                </li>
              </ul>
            </section>
          </div>
          <div>
            <main class="grid">
              <article class="produto" id="europa">
                <img src="imagens/hlnd.jpg" alt="Holanda" />
                <div class="text">
                  <h3>Holanda</h3>
                  <p>
                    Holanda: veja dicas de passeios, restaurantes, atrações,
                    gastronomia, hotéis, parques de flores, museus <br /> e
                    city-tours por Amsterdã, Rotterdam. <br />{" "}
                    <strong>R$ 5,900</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" class="produto" id="europa">
                <img src="imagens/it.jpg" alt="Itália" />
                <div class="text">
                  <h3>Itália</h3>
                  <p>
                    Itália: guia com conteúdo da Viagem e Turismo com sugestão
                    de atrações, restaurantes, roteiros, gastronomia, passeios e
                    fotos.
                    <br /> <strong>R$ 11,900</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" class="produto" id="europa">
                <img src="imagens/fr.jpg" alt="França" />
                <div class="text">
                  <h3>França</h3>
                  <p>
                    França: País que mais recebe turistas no mundo, a França
                    oferece museus maravilhosos, paisagens belíssimas, muito
                    charme e boa comida.
                    <br /> <strong>R$ 20,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="europa">
                <img src="imagens/madrid.jpg" alt="Madrid" />
                <div class="text">
                  <h3>Espanha</h3>
                  <p>
                    Espanha: Arena de touros de Las Ventas, Madri
                    Thinkstock/Thinkstock. Melhor época para visitar.
                    <br /> <strong>R$ 16,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="europa">
                <img src="imagens/rss.jpg" alt="Rússia" />
                <div class="text">
                  <h3>Rússia</h3>
                  <p>
                    A Rússia é o maior país do mundo, com ótimas paisagens e
                    atrações culturais em cidades como Moscou e São Petersburgo.
                    <br /> <strong>R$ 10,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" class="produto" id="europa">
                <img src="imagens/al.jpg" alt="Alemanha" />
                <div class="text">
                  <h3>Alemanha</h3>
                  <p>
                    A Alemanha é um país organizado, com belas paisagens de
                    castelos e florestas, museus esplêndidos e metrópoles como
                    Berlim.
                    <br /> <strong>R$ 12,600</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" class="produto" id="europa">
                <img src="imagens/belg.jpg" alt="Bélgica" />
                <div class="text">
                  <h3>Bélgica</h3>
                  <p>
                    Bélgíca: dicas de passeios, hotéis, atrações, restaurantes,
                    gastronomia, pacotes, onde comer, onde ficar em Flandres e
                    Valônia.
                    <br /> <strong>R$ 7,600</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="europa">
                <img src="imagens/portugal.jpg" alt="Holanda" />
                <div class="text">
                  <h3>Portugal</h3>
                  <p>
                    A visita a Portugal é como uma jornada à terra-mãe, com a
                    história e gastronomia de cidades como Lisboa, Porto, Sintra
                    e Guimarães.
                    <br /> <strong>R$ 4,600</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="ams">
                <img src="imagens/arg.jpg" alt="Argentina" />
                <div class="text">
                  <h3>Argentina</h3>
                  <p>
                    Argentina: descubra o mapa com destinos interessantes, como
                    Mendoza, El Calafate, Bariloche, Ushuaia e o melhor de
                    Buenos Aires.
                    <br /> <strong>R$ 3,700</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="ams">
                <img src="imagens/colo.jpg" alt="Colombia" />
                <div class="text">
                  <h3>Colômbia</h3>
                  <p>
                    Colômbia: Ideal para quem gosta de lindas paisagens naturais
                    sem deixar de lado a economia
                    <br /> <strong>R$ 1,500</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="ams">
                <img src="imagens/chile.jpg" alt="chile" />
                <div class="text">
                  <h3>Chile</h3>
                  <p>
                    Chile: Onde o impossível é possível. Do extremo norte com o
                    deserto mais seco do mundo, ao sul austral com gelo eterno e
                    quedas de água invertidas.
                    <br /> <strong>R$ 2,700</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="amn">
                <img src="imagens/cc.jpg" alt="Canada" />
                <div class="text">
                  <h3>Canadá</h3>
                  <p>
                    {" "}
                    Canadá: dicas de roteiros, viagem, atrações turísticas,
                    hotéis, restaurantes, turismo, onde ficar, onde comer e
                    outras informações..
                    <br /> <strong>R$ 9,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="amn">
                <img src="imagens/eua.jpeg" alt="Eua" />
                <div class="text">
                  <h3>Eua</h3>
                  <p>
                    {" "}
                    Descubra a América. Os Estados Unidos da América têm tanto a
                    oferecer! Aprenda sobre sua história.
                    <br /> <strong>R$ 11,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="africa">
                <img src="imagens/costam.jpg" alt="Costa do Marfim" />
                <div class="text">
                  <h3>Costa do Marfim</h3>
                  <p>
                    {" "}
                    Costa do Marfim. Roteiros de viagens, dicas sobre o que ver
                    e fazer, onde ficar e quando viajar para Costa do Marfim em
                    turismo.
                    <br /> <strong>R$ 12,100</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="africa">
                <img src="imagens/jamaica.jpg" alt="jamaica" />
                <div class="text">
                  <h3>Jamaica</h3>
                  <p>
                    Jamaica: Um destino para turistas que buscam praias
                    paradisíacas, reggae, rastafáris, resorts all-inclusive e
                    turismo tanto de massa.
                    <br /> <strong>R$ 15,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
              <article class="produto" id="africa">
                <img src="imagens/af.jpg" alt="Africa do Sula" />
                <div class="text">
                  <h3>África do Sul</h3>
                  <p>
                    Um país que pode surpreender até mesmo o viajante mais
                    experiente, o turismo na África do Sul oferece atrações para
                    todos os gostos
                    <br /> <strong>R$ 17,000</strong>
                  </p>
                  <button
                    class="botao"
                    onClick={() => alert("Item adicionado ao Carrinho")}
                  >
                    Comprar
                  </button>
                </div>
              </article>
            </main>
          </div>
        </div>
      </div>
    );
  }
}
