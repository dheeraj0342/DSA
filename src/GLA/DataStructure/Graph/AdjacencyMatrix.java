package GLA.DataStructure.Graph;

public class AdjacencyMatrix {
    private int[][] graph;
    private int vertex;

    AdjacencyMatrix(int vertex){
        graph = new int[vertex][vertex];
        this.vertex = vertex;
    }

    public void addEdge(int u,int v){
        graph[u][v] = 1;
        graph[v][u] =1;
    }
}
