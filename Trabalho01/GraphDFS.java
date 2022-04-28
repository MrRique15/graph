import java.util.*;

class GraphDFS{
    private int num_vertices;
    private LinkedList<Integer> adj[];

    public GraphDFS(int num_v, LinkedList<Integer> adj[]){
        this.num_vertices = num_v;
        this.adj = adj;
    }

    public void buscaDFS(int raiz) {                     
        String vertices_visitados[] = new String[num_vertices];   
        for(int i = 0; i < vertices_visitados.length; i++) {      
            vertices_visitados[i] = "BRANCO";                     
        }
        recursaoDFS(raiz, vertices_visitados);                    
    }
    
    private void recursaoDFS(int raiz, String[] visitado) {
        int destino = 0;

        visitado[raiz] = "CINZA";                        
        
        System.out.print(raiz+" ");                      
        
        for(int i = 0; i < adj[raiz].size(); i++) {      
            destino = adj[raiz].get(i);                  
            if (visitado[destino] == "BRANCO"){          
                //System.out.println("Saindo do vertice: "+ raiz +" e Visitando vertice: "+ destino);
                
                recursaoDFS(destino, visitado);
            }
            visitado[raiz] = "PRETO";                    
        }
    }
}
