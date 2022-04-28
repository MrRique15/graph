import java.util.LinkedList;
import java.util.Queue;

public class GraphFordFulkerson {
    int vertices;
    int graph[][];

    public GraphFordFulkerson(int vertex, int[][] graph){
        this.vertices = vertex;
        this.graph = graph;
    }

    public int fukersonMaxFlow(int raiz, int destino){
        int[][] auxGraph = new int[vertices][vertices];
        for (int i = 0; i <vertices ; i++) {
            for (int j = 0; j <vertices ; j++) {
                auxGraph[i][j] = graph[i][j];
            }
        }

        int[] pathUsed = new int[vertices]; //Armazena o caminho utilizado para o fluxo máximo
        int max_flow = 0; //Inicialmente, o fluxo máximo é 0
        while(findPathBFS(auxGraph, raiz, destino, pathUsed)){

            int flow_capacity = Integer.MAX_VALUE;
            int t = destino;

            while(t != raiz){
                int s = pathUsed[t];
                flow_capacity = Math.min(flow_capacity, auxGraph[s][t]);
                t = s;
            }

            t = destino;

            while(t != raiz){
                int s = pathUsed[t];
                auxGraph[s][t]-=flow_capacity;
                auxGraph[t][s]+=flow_capacity;
                t = s;
            }
            
            
            max_flow+=flow_capacity;
        }
        return max_flow;
    }

    public boolean findPathBFS(int [][] auxGraph, int raiz, int destino, int [] pathUsed){
        boolean pathFound = false;
        boolean [] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(raiz);
        pathUsed[raiz] = -1;
        visited[raiz] = true;

        while(queue.isEmpty() == false){
            int u = queue.poll();
            for (int v = 0; v <vertices ; v++) {
                if(visited[v]==false && auxGraph[u][v]>0) {
                    queue.add(v);
                    pathUsed[v] = u;
                    visited[v] = true;
                }
            }
        }
        pathFound = visited[destino];
        return pathFound;
    }
}
