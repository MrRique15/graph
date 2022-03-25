public class Main {
    public static void main(String args[])
    {
        //Grafo inicial de backup para todas as buscas//
        Graph grafo = new Graph(6);    //Cria a instancia do grafo com 6 vértices
        
        //Cria os vértices do grafo
        Node nodeA = new Node("A",0);
        Node nodeB = new Node("B",1);
        Node nodeC = new Node("C",2);
        Node nodeD = new Node("D",3); 
        Node nodeE = new Node("E",4);
        Node nodeF = new Node("F",5);

        //Adiciona os destinos aos vértices criados com seus pesos das arestas
        //0
        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeD, 1);
        nodeA.addDestination(nodeE, 1);
        //1
        nodeB.addDestination(nodeA, 1);
        nodeB.addDestination(nodeC, 1);
        //2
        nodeC.addDestination(nodeB, 1);
        nodeC.addDestination(nodeD, 1);
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
        grafo.addAresta(0, 1, 10);               
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

        //Adiciona os vértices criados ao grafo orientado
        grafo.addNode(nodeA);
        grafo.addNode(nodeB);
        grafo.addNode(nodeC);
        grafo.addNode(nodeD);
        grafo.addNode(nodeE);
        grafo.addNode(nodeF);

        Graph forBS = grafo;
        System.out.println("A busca em largura para o grafo acima é: ");
        //Largura
        forBS.BFS(0);

        Graph forDFS = grafo;
        System.out.println("\nA busca em profundidade para o grafo acima é: ");
        //Profundidade
        forDFS.DFS(0);

        Graph forBellmanFord = grafo;
        System.out.println("\nO Algoritmo de BellmanFord para o grafo acima é: ");
        //BellmanFord
        forBellmanFord.BellmanFord(0);

        Graph forDijkstra = grafo;
        System.out.println("\nO Algoritmo de Dijkstra para o grafo acima é: ");
        //Dijkstra
        forDijkstra.Dijkstra(forDijkstra, nodeA);

        Graph forFLoydWarshal = grafo;
        System.out.println("\nO Algoritmo de FLoydWarshal para o grafo acima é: ");
        //FLoydWarshal
        forFLoydWarshal.FloydWarshal(forFLoydWarshal);
    }
}
