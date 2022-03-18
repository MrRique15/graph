import java.util.*;

class Graph{
    private int num_vertices;                       
    private LinkedList<Integer> adj[];              
    private Queue<Integer> queue;                   
    private GraphDFS dfs;
    private GraphBFS bfs;

    Graph(int vertices){
        num_vertices = vertices;
        adj = new LinkedList[vertices];     

        for (int i=0; i<vertices; i++){
            adj[i] = new LinkedList<>();    
        }
        queue = new LinkedList<Integer>();      
        
        this.dfs = new GraphDFS(num_vertices, adj);
        this.bfs = new GraphBFS(num_vertices, adj, queue);
    }

    public void addAresta(int origem,int destino, int peso){
        adj[origem].add(destino);                   
    }

    public void DFS(int raiz){
        dfs.buscaDFS(raiz);
    }

    public void BFS(int raiz){
        bfs.buscaBFS(raiz);
    }
}
