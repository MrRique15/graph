import java.util.*;

class Graph{
    private int num_vertices;                       
    private LinkedList<Integer> adj[];              
    private Queue<Integer> queue;                   
    private GraphDFS dfs;
    private GraphBFS bfs;
    private Vector<Edge> arestas;
    private Set<Node> nodes = new HashSet<>();

    Graph(int vertices){
        this.num_vertices = vertices;
        this.adj = new LinkedList[vertices];
        this.arestas = new Vector<Edge>();

        for (int i=0; i<vertices; i++){
            adj[i] = new LinkedList<>();    
        }
        queue = new LinkedList<Integer>();      
        
        this.dfs = new GraphDFS(num_vertices, adj);
        this.bfs = new GraphBFS(num_vertices, adj, queue);
    }

    public void addAresta(int origem,int destino, int peso){
        adj[origem].add(destino);
        Edge a = new Edge(origem, destino, peso);
        arestas.add(a);           
    }

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    //Profundidade
    public void DFS(int raiz){
        dfs.buscaDFS(raiz);
    }

    //Largura
    public void BFS(int raiz){
        bfs.buscaBFS(raiz);
    }

    //Bellman Ford
    public void BellmanFord(int raiz){
        GraphBellmanFord bellman = new GraphBellmanFord(num_vertices, arestas);
        bellman.BellmanFord(raiz);
    }

    //Dijkstra
    public void Dijkstra(Graph g, Node raiz){
        GraphDijkstra dijkstra = new GraphDijkstra();
        dijkstra.calculateShortestPathFromSource(g, raiz);

        for (Node n : nodes) {
            System.out.println(n.getName() + " " + n.getDistance());
        }
    }
}
