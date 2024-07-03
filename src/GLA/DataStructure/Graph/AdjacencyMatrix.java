package GLA.DataStructure.Graph;

import java.util.*;


public class AdjacencyMatrix {
    ArrayList<Integer> []graph;

    AdjacencyMatrix(int vertex){
        this.graph = new ArrayList[vertex];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();

        }
    }

    public void addEdge(int u,int v){
        graph[u].add(v);
        graph[v].add(u);
    }
    public void print(){
        for (ArrayList list : graph) {
            System.out.println(list);
        }
    }

    public static void bfs(AdjacencyMatrix g , int s){
        boolean[] isVisited = new boolean[g.graph.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(s);
        while(!queue.isEmpty()){
            int  i = queue.poll();
            if(!isVisited[i]){
                isVisited[i] = true;
                System.out.print(i+" ");
                for(Integer val : g.graph[i]){
                    if(!isVisited[val])
                        queue.offer(val);
                    }
                }
            }
        }

    public static void dfs(AdjacencyMatrix g , int s){
        boolean[] isVisited = new boolean[g.graph.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(s);
        while(!stack.isEmpty()){
            int  i = stack.pop();
            if(!isVisited[i]){
                isVisited[i] = true;
                System.out.print(i+" ");
                for(Integer val : g.graph[i]){
                    if(!isVisited[val])
                        stack.push(val);
                }
            }
        }
    }

    public static boolean isCycle(AdjacencyMatrix g , int s){
        boolean[] isVisited = new boolean[g.graph.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(s);
        while(!stack.isEmpty()){
            int  i = stack.pop();
            if(!isVisited[i]){
                isVisited[i] = true;
                for(Integer val : g.graph[i]){
                    if(!isVisited[val])
                        stack.push(val);
                    else
                        return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        AdjacencyMatrix g = new AdjacencyMatrix(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.print();
        bfs(g,0);
        System.out.println();
        dfs(g,0);
        System.out.println();
        System.out.println(isCycle(g,0));


    }
}
