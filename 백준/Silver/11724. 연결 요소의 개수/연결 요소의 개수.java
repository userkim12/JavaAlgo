import java.util.*;
import java.io.*;

public class Main {
    static int MAX_N = 1001;
    static int[][] graph = new int[MAX_N][MAX_N];
    static int node, edge;
    static boolean[] visited = new boolean[MAX_N];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        for(int i=0;i<edge;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        int answer = 0;
        for(int i=1;i<=node;i++){
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void dfs(int n) {
        visited[n] = true;

        for(int i=1;i<=node;i++) {
            if(!visited[i] && graph[n][i] != 0) dfs(i);
        }
    }
}