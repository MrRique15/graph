class GraphPrim {
    private int V;

    public GraphPrim(int v) {
        this.V = v;
    }

    int chaveMinima(int key[], Boolean mstSet[]){
        int min = Integer.MAX_VALUE, index_mix = -1;
 
        for (int v = 0; v < V; v++){ 
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                index_mix = v;
            }
        }
        return index_mix;
    }

    void mostrarMST(int parent[], int graph[][]){
        System.out.println("Vértice \tPeso");
        for (int i = 1; i < V; i++){
            System.out.println(parent[i] + " - " + i + "\t\t  " + graph[i][parent[i]]);
        }
    }

    void primAlgMST(int graph[][], int vertices){
        this.V = vertices;
        int parent[] = new int[V];
        int key[] = new int[V];
        Boolean mstSet[] = new Boolean[V];
 
        //Inicializa todos os valores de key como infinito
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
 
        key[0] = 0;
        parent[0] = -1;
 
        // A árvore geradora mínima terá um número V de vértices
        for (int count = 0; count < V - 1; count++){
            int u = chaveMinima(key, mstSet);
 
            mstSet[u] = true;

            for (int v = 0; v < V; v++){
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            } 
        }

        // Mostrar a árvore geradora mínima
        mostrarMST(parent, graph);
    }
}
