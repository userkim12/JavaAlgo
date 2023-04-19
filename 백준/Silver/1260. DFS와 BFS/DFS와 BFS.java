import java.io.*;
import java.util.*;

public class Main {
    static int N, E, V;
    static int[][] Graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        Graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0;i<E;i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Graph[a][b] = Graph[b][a] = 1;
        }

        dfs(V);
        visited = new boolean[N+1];
        System.out.println();
        bfs(V);

    }

    static private void dfs(int node) {
        visited[node] = true;

        System.out.print(node + " ");
        for(int i=1;i<=N;i++) {
            if(!visited[i] && Graph[node][i] != 0) dfs(i);
        }
    }

    static private void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        visited[node] = true;

        q.add(node);
        while(!q.isEmpty()) {
            int cur = q.poll();

            System.out.print(cur + " ");
            for(int i=0;i<=N;i++) {
                if(!visited[i] && Graph[cur][i] != 0) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}