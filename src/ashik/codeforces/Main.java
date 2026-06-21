package ashik.codeforces;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int n = sc.nextInt(); int m = sc.nextInt();
        int[] a = new int[n+1];
        ArrayList<Integer>[] charachters = new ArrayList[n+1];

        for (int i=1; i<=n; i++) a[i]=sc.nextInt();
        for (int i=0; i<m; i++) {
            int u=sc.nextInt(), v=sc.nextInt();
            if (charachters[u] == null) charachters[u]=new ArrayList<>();
            if (charachters[v] == null) charachters[v]=new ArrayList<>();

            charachters[u].add(v); charachters[v].add(u);
        }
        long sum = 0;
        for (int i=1; i<=n; i++){
            if (!visited[i]) sum+=bfs(charachters, i, a); 
        }
        System.out.println(sum);

        sc.close();
    }
    static boolean[] visited = new boolean[100001];

    public static long bfs(ArrayList<Integer>[] graph, int s, int[] a){
        long min = Integer.MAX_VALUE;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);

        while (!q.isEmpty()){
            int k = q.remove();
            visited[k]=true; min = Math.min(min, a[k]);

            for (int j=0; graph[k]!=null && j<graph[k].size(); j++){
                int p = graph[k].get(j);
                if (!visited[p]) q.add(p);
            }
        }

        return min;
    }
}
