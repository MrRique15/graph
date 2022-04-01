import java.util.*;

public class GraphFloydWarshal{
    private int INF = 99999, V = 0;

    void getFloydWarshall(Graph g, int V, Vector<Edge> arestas, Set<Node> nodes)
    {
        this.V = V;
        int dist[][] = new int[V][V];
        String pais[][] = new String[V][V];
        int i, j, k;

        for (i = 0; i < V; i++){
            for (j = 0; j < V; j++){
                if(i == j){
                    dist[i][j] = 0;
                    pais[i][j] = null;
                }else{
                    dist[i][j] = INF;
                    pais[i][j] = null;
                }
            } 
        }

        for (Node n : nodes)
        {
            Map<Node, Integer> adj = n.getAdjacentNodes();
            for(Map.Entry<Node, Integer> entry : adj.entrySet()){
                dist[n.getNumber()][entry.getKey().getNumber()] = entry.getValue();
                pais[n.getNumber()][entry.getKey().getNumber()] = n.getName();
            }
        }

        for (k = 0; k < V; k++){
            for (i = 0; i < V; i++){
                for (j = 0; j < V; j++){
                    if (dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                        pais[i][j] = pais[k][j];
                    }
                }
            }
        }
        printSolution(dist, pais);
    }
 
    void printSolution(int dist[][], String pais[][])
    {
        System.out.println("A matriz seguinte mostra os menores caminhos para todos os vertices do grafo:");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF  ");
                else
                    System.out.print(dist[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("A matriz seguinte apresenta os vértices pai que proporcionaram o menor caminho acima:");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (pais[i][j]==null)
                    System.out.print("nil  ");
                else
                    System.out.print(pais[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
