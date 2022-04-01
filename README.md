<h1>Algoritmos para Grafo Orientado</h1>


Nesse projeto, temos um Grafo orientado e com pesos definidos para suas arestas, onde há a implementação dos seguintes algoritmos:
<p>-> Busca em Largura; **BFS**</p>
<p>-> Busca em Profundidade; **DFS**</p>
<p>-> Algoritmo de **BellmanFord**</p>
<p>-> Algoritmo **Dijkstra**</p>
<p>-> Algoritmo **Floyd-Warshall**</p>

Para a instância do grafo dentro do arquivo MAIN, deve-se preencher:

1) Graph grafo = new Graph(**n**);
  <p>1.1) n é o número de vértices do grafo;</p>
  
2) Node nodeA = new Node("A",0);
  <p>2.1) nodeA representa apenas o vértice 1 do grafo, mas necessita-se instancias todos os vértices do grafo.
  <br>Com seu respectivo Nome e número dentro da matriz do grafo, no caso o vértice 1 tem nome A e valor numérico 0</p>
3) nodeA.addDestination(nodeB, 10, grafo);
4) grafo.addNode(nodeA);
