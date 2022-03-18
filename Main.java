public class Main {
    public static void main(String args[])
    {
        Graph grafo = new Graph(6);    //Cria a instancia do grafo com 6 vértices
 
        //Adiciona arestas para o grafo orientado
        grafo.addAresta(0, 1, 1);               
        grafo.addAresta(0, 3, 1);
        grafo.addAresta(0, 4, 1);
        grafo.addAresta(4, 5, 1);
        grafo.addAresta(3, 5, 1);
        grafo.addAresta(1, 2, 1);
        grafo.addAresta(1, 0, 1);
        grafo.addAresta(2, 1, 1);
        grafo.addAresta(4, 1, 1);
        grafo.addAresta(3, 1, 1);
        grafo.addAresta(5, 4, 1);
        grafo.addAresta(5, 3, 1);
 
        System.out.println("A busca em largura para o grafo acima é: ");
 
        grafo.BFS(0);

        System.out.println("\nA busca em profundidade para o grafo acima é: ");

        grafo.DFS(0);

        System.out.println("\nO Algoritmo de BellmanFord para o grafo acima é: ");

        grafo.BellmanFord(0);
    }
}
