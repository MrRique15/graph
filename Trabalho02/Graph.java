class Graph{
    private int num_vertices;                       
    private int raiz;
    private int destino;
    private int graph[][];

    Graph(int vertices, int raiz, int destino, int[][] graph){
        this.num_vertices = vertices;
        this.destino = destino;
        this.raiz = raiz;
        this.graph = graph;
    }

    public int getVertices(){
        return this.num_vertices;
    }

    public int getRaiz(){
        return this.raiz;
    }

    public int getDestino(){
        return this.destino;
    }

    public int[][] getGraph(){
        return this.graph;
    }

    //Ford Fulkerson
    public int FordFulkerson(){
        GraphFordFulkerson fulkerson = new GraphFordFulkerson(this.num_vertices, this.graph);
        return fulkerson.fukersonMaxFlow(this.raiz,this.destino);
    }

    public void Prim(){
        GraphPrim prim = new GraphPrim(this.num_vertices);
        prim.primAlgMST(this.graph,this.num_vertices);
    }
}
