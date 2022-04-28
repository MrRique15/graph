public class Main {
    public static void main(String args[])
    {

        //-----------------------------------------------------------------------------//
        //-----                       Instanciação do GRAFO                       -----//
        //-----------------------------------------------------------------------------//
        //Grafo inicial de backup para todas as buscas//
        Graph grafo = new Graph(6);    //Cria a instancia do grafo com n=6 vértices

        //Cria os vértices do grafo (Nome, Número)//
        Node nodeA = new Node("A",0);
        Node nodeB = new Node("B",1);
        Node nodeC = new Node("C",2);
        Node nodeD = new Node("D",3); 
        Node nodeE = new Node("E",4);
        Node nodeF = new Node("F",5);
        //Adiciona os destinos aos vértices criados com seus pesos nas arestas
        //0
        nodeA.addDestination(nodeB, 10, grafo);
        nodeA.addDestination(nodeD, 1, grafo);
        nodeA.addDestination(nodeE, 1, grafo);
        //1
        nodeB.addDestination(nodeA, 1, grafo);
        nodeB.addDestination(nodeC, 1, grafo);
        //2
        nodeC.addDestination(nodeB, 1, grafo);
        nodeC.addDestination(nodeD, 1, grafo);
        //3
        nodeD.addDestination(nodeB, 1, grafo);
        nodeD.addDestination(nodeF, 1, grafo);
        //4
        nodeE.addDestination(nodeB, 1, grafo);
        nodeE.addDestination(nodeF, 1, grafo);
        //5
        nodeF.addDestination(nodeD, 1, grafo);
        nodeF.addDestination(nodeE, 1, grafo);
        //Adiciona a estrutura dos vértces ao grafo original
        grafo.addNode(nodeA);
        grafo.addNode(nodeB);
        grafo.addNode(nodeC);
        grafo.addNode(nodeD);
        grafo.addNode(nodeE);
        grafo.addNode(nodeF);




        //-----------------------------------------------------------------------------//
        //-----                  Buscas para o GRAFO informado                    -----//
        //-----------------------------------------------------------------------------//
        Graph forBS = grafo;
        System.out.println("\nA busca em largura para o grafo acima é: ");
        //Largura
        forBS.BFS(0);

        Graph forDFS = grafo;
        System.out.println("\n\nA busca em profundidade para o grafo acima é: ");
        //Profundidade
        forDFS.DFS(0);

        Graph forBellmanFord = grafo;
        System.out.println("\n\nO Algoritmo de BellmanFord para o grafo acima é: ");
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
