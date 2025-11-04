import java.util.ArrayList;
// Node structure
class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
    
    
    static void dfsRec(ArrayList<ArrayList<Integer>> adj,
           boolean[] visited, int s, ArrayList<Integer> res)
    {
        visited[s] = true;
        res.add(s);

        // Recursively visit all adjacent vertices 
        // that are not visited yet
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfsRec(adj, visited, i, res);
            }
        }
    
    }
    

    public static void main(String[] args) {
       
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        
        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;
// this is for testing the DFS fucntion 
        // number of vertics 
        int V = 5; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // create empty adjacency lists
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // add edges 
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(4);
        adj.get(4).add(2);

        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
       // testing the DFS function Depth First Search
        dfsRec(adj, visited, 0, res); 

        System.out.println("DFS traversal starting from 0: " + res);
    }

    
}