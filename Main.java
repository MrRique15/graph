public class Main {
    public static void main(String args[])
    {
        Graph grafo = new Graph(6);    //Cria a instancia do grafo com 6 vértices
        
        //Cria os vértices do grafo
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D"); 
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        //0
        nodeA.addDestination(nodeB, 1);
        nodeA.addDestination(nodeD, 1);
        nodeA.addDestination(nodeE, 1);
        //1
        nodeB.addDestination(nodeA, 1);
        nodeB.addDestination(nodeB, 1);

        //2
        nodeC.addDestination(nodeB, 1);
        //3
        nodeD.addDestination(nodeB, 1);
        nodeD.addDestination(nodeF, 1);
        //4
        nodeE.addDestination(nodeB, 1);
        nodeE.addDestination(nodeF, 1);
        //5
        nodeF.addDestination(nodeD, 1);
        nodeF.addDestination(nodeE, 1);

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

        grafo.addNode(nodeA);
        grafo.addNode(nodeB);
        grafo.addNode(nodeC);
        grafo.addNode(nodeD);
        grafo.addNode(nodeE);
        grafo.addNode(nodeF);
        System.out.println("A busca em largura para o grafo acima é: ");
 
        grafo.BFS(0);

        System.out.println("\nA busca em profundidade para o grafo acima é: ");

        grafo.DFS(0);

        System.out.println("\nO Algoritmo de BellmanFord para o grafo acima é: ");

        grafo.BellmanFord(0);
    }
}
