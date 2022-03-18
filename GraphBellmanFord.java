import java.util.Vector;

public class GraphBellmanFord {
    private int num_v = 0;
    private Vector<Edge> arestas;

    public GraphBellmanFord(int num_v, Vector<Edge> edges) {
        this.num_v = num_v;
        this.arestas = edges;
    }

    public void BellmanFord(int raiz) {
        int distance[] = new int[this.num_v];
        boolean hasNegativeCycle = getShortestPaths(num_v, raiz, distance, arestas);
        if (!hasNegativeCycle) {
            System.out.println("Vertex \t: Distance");
            for (int i = 1; i < distance.length; i++)
                System.out.println("\t" + i + " " + "\t\t" + (distance[i] == Integer.MAX_VALUE ? "-" : distance[i]));
        } else {
            System.out.println("Negative cycle exists in the graph, no solution found!!!");
        }
    }

    //Logica de BellmanFord
    public static boolean getShortestPaths(int vertices, int source, int[] distance, Vector<Edge> edges) {
        int V = vertices;
        
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        
        distance[source] = 0;

        // RELAXAMENTO
        for (int i = 1; i < V; i++) {
            // iterate over edges
            for (Edge e : edges) {
                int u = e.getU(), v = e.getV(), w = e.getW();
                if (distance[u] != Integer.MAX_VALUE && distance[v] > distance[u] + w) {
                    // calculates distance
                    distance[v] = distance[u] + w;
                }
            }
        }

        // CHECANDO SE NAO EXISTE CAMINHO COM PESO -1 NO GRAFO
        for (Edge e : edges) {
            int u = e.getU(), v = e.getV(), w = e.getW();
            if (distance[u] != Integer.MAX_VALUE && distance[v] > distance[u] + w) {
                return true;
            }
        }
        return false;
    }
}
