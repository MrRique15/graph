import java.util.*;

class GraphBFS{
    private int num_vertices;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    public GraphBFS(int num_v, LinkedList<Integer> adj[], Queue<Integer> queue){
        this.num_vertices = num_v;
        this.adj = adj;
        this.queue = queue;
    }

    public void buscaBFS(int raiz){
        boolean vertices_visitados[] = new boolean[num_vertices];       
        int a = 0;                                                      
 
        vertices_visitados[raiz] = true;             
        queue.add(raiz);                             
 
        while (queue.size() != 0){
            raiz = queue.poll();                
            System.out.print(raiz+" ");          
 
            for (int i = 0; i < adj[raiz].size(); i++){   
                a = adj[raiz].get(i);                          
                if (!vertices_visitados[a]){                   
                    
                    //System.out.println("Saindo do vertice: "+ raiz +" e Visitando vertice: "+ a);
                    
                    vertices_visitados[a] = true;              
                    queue.add(a);                              
                }
            }  
        }
    }
}
