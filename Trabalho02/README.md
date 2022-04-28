<h1>Algoritmos para Grafo Orientado</h1>


Nesse projeto, temos um Grafo orientado e com pesos definidos para suas arestas, onde há a implementação dos seguintes algoritmos:
<p>-> Busca em Largura; <strong>BFS</strong></p>
<p>-> Busca em Profundidade; <strong>DFS</strong></p>
<p>-> Algoritmo de <strong>BellmanFord</strong></p>
<p>-> Algoritmo <strong>Dijkstra</strong></p>
<p>-> Algoritmo <strong>Floyd-Warshall</strong></p>

<br/>
Para a instância do grafo dentro do arquivo MAIN, deve-se preencher:

1) Graph grafo = new Graph(**n**);
  <p>1.1) n é o número de vértices do grafo;</p>
<br/>
2) Node nodeA = new Node("A",0);
  <p>2.1) nodeA representa apenas o vértice 1 do grafo, necessita-se instanciar todos os vértices do grafo,
  <br/>com seu respectivo Nome e número inteiro dentro da matriz do grafo, no caso o vértice 1 tem nome A e valor numérico 0</p>
<br/>
3) nodeA.addDestination(nodeB, 10, grafo);
  <p>3.1) Esta instrução deverá ser utiliada para adicionar as arestas do grafo, para todas as arestas existentes.
  <br/>Utiliza-se os vértices criados, com a função <b>addDestination(destino,peso,grafo)</b>, onde grafo é o grafo criado.</p>
<br/>
4) grafo.addNode(nodeA);
  <p>4.1) Após a conclusão da fase de instância de todos os vértices e arestas, deve-se instruir a adição
  de todos os vértices criados, ao grafo, utilizando a função <b>addNode</b> do grafo criado, para cada vértice instanciado.</p>
<br/>
