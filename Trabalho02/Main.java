public class Main {
    public static void main(String args[])
    {

        //-----------------------------------------------------------------------------//
        //-----                       Instanciação do GRAFO                       -----//
        //-----------------------------------------------------------------------------//
        int raiz = 0;
        int destino = 4;
        int vertices = 5;
        int graph[][] = new int[][] {
            { 0, 2, 0, 6, 0 },
            { 2, 0, 3, 8, 5 },
            { 0, 3, 0, 0, 7 },
            { 6, 8, 0, 0, 9 },
            { 0, 5, 7, 9, 0 }
        };

        System.out.println("//-----------------------------------------------------------------------------//");
        System.out.println("//-----                       Ford Fulkerson + PRIM                       -----//");
        System.out.println("//-----         O grafo possui: " + vertices + " vertices, Raiz: " + raiz + " e Destino: " + destino + "          -----//");
        System.out.println("//-----------------------------------------------------------------------------//");
        Graph g = new Graph(vertices, raiz, destino, graph);
        int max_flow = g.FordFulkerson();
        System.out.println("\n[-----Ford Fulkerson-----]");
        System.out.println("O fluxo máximo a partir da origem: " + raiz + " para o destino: " + destino + " é: " + max_flow + "\nObtido com o algoritmo de Ford Fulkerson.\n");
        System.out.println("[-----PRIM-----]");
        System.out.println("A árvore geradora mínima para o grafo é: ");
        g.Prim();
        System.out.println("Gerada a partir do algoritmo de PRIM.\n");
    }
}
