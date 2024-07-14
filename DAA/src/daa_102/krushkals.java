package daa_102;
import java.util.*;
class Edge implements Comparable<Edge> {
    int src;
    int des;
    int wt;

    public int compareTo(Edge compareEdge) {
        return this.wt - compareEdge.wt;
    }
}

public class krushkals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v, e, i;
        
        System.out.println("Enter number of vertices:");
        v = in.nextInt();
        
        System.out.println("Enter number of edges:");
        e = in.nextInt();
        
        Edge imp[] = new Edge[e];
        
        System.out.println("Enter source, destination and weight of " + e + " edges:");
        for (i = 0; i < e; i++) {
            imp[i] = new Edge();
            imp[i].src = in.nextInt() - 1; // Adjusting for zero-based indexing
            imp[i].des = in.nextInt() - 1; // Adjusting for zero-based indexing
            imp[i].wt = in.nextInt();
        }
        
        func_krus(imp, v, e);
    }

    private static void func_krus(Edge imp[], int v, int e) {
        Arrays.sort(imp);
        
        List<Edge> op = new ArrayList<>();
        int k = 0, i;
        int parent[] = new int[v];
        
        for (i = 0; i < v; i++) {
            parent[i] = i;
        }
        
        for (i = 0; i < e; i++) {
            if (k == v - 1) break;
            Edge currEdge = imp[i];
            int src_parent = find(currEdge.src, parent);
            int des_parent = find(currEdge.des, parent);
            
            if (src_parent != des_parent) {
                op.add(currEdge);
                k++;
                parent[src_parent] = des_parent;
            }
        }
        
        for (i = 0; i < op.size(); i++) {
            System.out.println(op.get(i).src + 1 + " ---> " + (op.get(i).des + 1) + " ---> " + op.get(i).wt);
        }
    }

    private static int find(int v, int parent[]) {
        if (parent[v] == v)
            return v;
        return parent[v] = find(parent[v], parent);
    }
}
