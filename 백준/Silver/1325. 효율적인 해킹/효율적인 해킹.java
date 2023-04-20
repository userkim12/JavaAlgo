import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static List<Integer>[] com;
    static boolean[] visited;
    static int[] cnt;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        com = new ArrayList[N+1];
        cnt = new int[N+1];
        for(int i=1;i<=N;i++) {
            com[i] = new ArrayList<>();
        }
        for(int i=1;i<=M;i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            com[a].add(b);
        }

        for(int i=1;i<=N;i++) {
            visited = new boolean[N+1];
            bfs(i);
        }

        int mx = 0;
        for(int i=1;i<=N;i++) {
            mx = Math.max(mx, cnt[i]);
        }

        for(int i=1;i<=N;i++) {
            if(mx == cnt[i]) System.out.print(i + " ");
        }
    }

    static private void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()) {
            int cur = q.poll();

            for(int i: com[cur]) {
                if(!visited[i]) {
                    cnt[i]++;
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}