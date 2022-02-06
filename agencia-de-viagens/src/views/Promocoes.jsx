import React from "react";
import "./css/Destino.css";

export default class Promocoes extends React.Component {
  render() {
    return (
      <div>
        <h1>Nossas promoções</h1>
        <main class="grid">
          <article class="produto">
            <img src="imagens/hlnd.jpg" alt="Holanda" />
            <div class="text">
              <h3>Holanda</h3>
              <p>Promoção imperdível! 3 dias na Holanda, com hotel incluso.</p>
              <p class="promocao">De R$ 5,900</p>
              <p> R$: 2,950</p>
              <button
                class="botao"
                onClick={() => alert("Item adicionado ao Carrinho")}
              >
                Comprar
              </button>
            </div>
          </article>
          <article class="produto">
            <img src="imagens/costam.jpg" alt="Costa do Marfim" />
            <div class="text">
              <h3>Costa do Marfim</h3>
              <p>
                Promoção de férias! 7 dias na Costa do Marfim, com hotel e
                transporte incluso.
              </p>
              <p class="promocao"> R$ 12,100</p>
              <p> R$: 6,670</p>
              <button
                class="botao"
                onClick={() => alert("Item adicionado ao Carrinho")}
              >
                Comprar
              </button>
            </div>
          </article>
          <article class="produto">
            <img src="imagens/eua.jpeg" alt="eua" />
            <div class="text">
              <h3>Eua</h3>
              <p>
                Promoção dos sonhos, 15 dias na terra dos sonhos com tudo
                incluso.
              </p>
              <p class="promocao"> R$ 11,000</p>
              <p> R$: 5,900</p>
              <button
                class="botao"
                onClick={() => alert("Item adicionado ao Carrinho")}
              >
                Comprar
              </button>
            </div>
          </article>
          <article class="produto">
            <img src="imagens/arg.jpg" alt="Argentina" />
            <div class="text">
              <h3>Argentina</h3>
              <p>Promoção alfajor, 6 dias na terra dos hermanos.</p>
              <p class="promocao"> R$ 3,700</p>
              <p> R$: 1,900</p>
              <button
                class="botao"
                onClick={() => alert("Item adicionado ao Carrinho")}
              >
                Comprar
              </button>
            </div>
          </article>
          <article class="produto">
            <img src="imagens/rss.jpg" alt="Rússia" />
            <div class="text">
              <h3>Rússia</h3>
              <p>Promoção inverno, 3 dias na terra dos ursos.</p>
              <p class="promocao"> R$ 10,000</p>
              <p> R$: 5,000</p>
              <button
                class="botao"
                onClick={() => alert("Item adicionado ao Carrinho")}
              >
                Comprar
              </button>
            </div>
          </article>
          <article class="produto">
            <img src="imagens/chile.jpg" alt="chile" />
            <div class="text">
              <h3>Chile</h3>
              <p>Promoção dos andis, 2 dias na terra vivendo um sonho.</p>
              <p class="promocao"> R$ 2,700</p>
              <p> R$: 1,100</p>
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
    );
  }
}
