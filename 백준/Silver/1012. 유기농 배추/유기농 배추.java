import java.io.*;
import java.util.*;

public class Main {

    static int M, N, K;
    static int[][] Graph;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] visited;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int cnt=0;cnt<T;cnt++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            Graph = new int[M][N];
            visited = new boolean[M][N];
            answer = 0;
            for(int i=0;i<K;i++) {
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                Graph[a][b] = 1;
            }

            for(int x=0;x<M;x++) {
                for(int y=0;y<N;y++) {
                    if(Graph[x][y] != 0 && !visited[x][y]) {
                        answer++;
                        dfs(x,y);
                    }
                }
            }
            System.out.println(answer);
        }

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0;i<4;i++) {
            int xx = x+dx[i];
            int yy = y+dy[i];

            if(0 <= xx && xx < M && 0 <= yy && yy < N)
                if(Graph[xx][yy] != 0 && !visited[xx][yy])  dfs(xx, yy);
        }
    }
}