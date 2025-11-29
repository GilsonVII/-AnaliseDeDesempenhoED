<div align="center">
  <h1>📊 Análise de Desempenho<br>Estruturas de Dados em Java</h1>
  
  <p>
    <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" alt="Java">
    <img src="https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow?style=for-the-badge" alt="Status">
    <img src="https://img.shields.io/badge/License-Academic-blue?style=for-the-badge" alt="License">
  </p>

  <p>
    <i>Comparação de performance entre Vetores, Árvores Binárias e Árvores AVL.</i>
  </p>
</div>

<hr>

<h2>🎯 Objetivo do Projeto</h2>
<p>
  Este projeto visa comparar o comportamento prático e a complexidade teórica de diferentes estruturas de dados. [cite_start]O foco é analisar o tempo de execução para <b>inserção</b>, <b>busca</b> e <b>ordenação</b> em cenários de estresse (grandes volumes de dados)[cite: 2, 3].
</p>

<blockquote>
  [cite_start]<b>⚠️ Importante:</b> Todo o código foi implementado <i>from scratch</i> (do zero), sem a utilização de bibliotecas de coleção do Java (`java.util.*`), garantindo o entendimento profundo dos algoritmos[cite: 6].
</blockquote>

<hr>

<h2>🚀 Funcionalidades Implementadas</h2>

<table>
  <tr>
    <td width="50%" valign="top">
      <h3>1️⃣ Estruturas de Dados</h3>
      <ul>
        [cite_start]<li><b>Vetor (Array Dinâmico):</b> Com redimensionamento manual[cite: 8].</li>
        [cite_start]<li><b>Árvore Binária de Busca (ABB):</b> Implementação clássica[cite: 9].</li>
        [cite_start]<li><b>Árvore AVL:</b> Balanceamento automático com rotações[cite: 10].</li>
      </ul>
    </td>
    <td width="50%" valign="top">
      <h3>2️⃣ Algoritmos & Buscas</h3>
      <ul>
        [cite_start]<li><b>Ordenação Simples:</b> <i>Selection Sort</i>[cite: 13].</li>
        [cite_start]<li><b>Ordenação Avançada:</b> <i>Merge Sort</i>[cite: 14].</li>
        [cite_start]<li><b>Busca Sequencial:</b> Para qualquer cenário[cite: 16].</li>
        [cite_start]<li><b>Busca Binária:</b> Otimizada para vetores ordenados[cite: 17].</li>
      </ul>
    </td>
  </tr>
</table>

<hr>

<h2>🧪 Metodologia de Testes</h2>
<p>Para garantir precisão, utilizamos a seguinte bateria de testes:</p>

<ul>
  [cite_start]<li><b>Cargas de Dados:</b> 100, 1.000 e 10.000 elementos [cite: 21-24].</li>
  <li><b>Cenários de Inserção:</b>
    <ul>
      <li>📈 Ordenada (Crescente)</li>
      <li>📉 Inversamente Ordenada (Decrescente)</li>
      <li>🎲 Aleatória</li>
    </ul>
  </li>
  [cite_start]<li><b>Precisão:</b> Cada teste é executado <b>5 vezes</b>, registrando-se a média aritmética dos tempos [cite: 42-43].</li>
</ul>

<hr>

<h2>📂 Estrutura de Arquivos</h2>

<pre>
projeto-analise-desempenho/
│
├── <b>src/</b>
│   ├── <b>estruturas/</b>      <span style="color: gray;"># Implementação de Vetor, ABB e AVL</span>
│   ├── <b>ordenacao/</b>       <span style="color: gray;"># Algoritmos de Sort (Selection, Quick, etc.)</span>
│   └── <b>main/</b>            <span style="color: gray;"># Geradores de dados e executor dos testes</span>
│
└── <b>README.md</b>            <span style="color: gray;"># Documentação do projeto</span>
</pre>

<hr>

<h2>🛠️ Como Executar</h2>

<details>
  <summary><b>Clique para ver as instruções de compilação</b></summary>
  
  <br>
  <p>Certifique-se de ter o <b>JDK (Java Development Kit)</b> instalado.</p>

  <b>1. Compilar o projeto:</b>
  <pre><code>mkdir bin
javac -d bin -sourcepath src src/main/Main.java</code></pre>

  <b>2. Rodar a aplicação:</b>
  <pre><code>java -cp bin main.Main</code></pre>
</details>

<hr>

<div align="center">
  <sub>Desenvolvido para a disciplina de Estrutura de Dados.</sub>
</div>

