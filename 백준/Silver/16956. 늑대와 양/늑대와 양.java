import java.io.*;
import java.util.*;

public class Main {
    static char[][] Graph;
    static int R, C;
    static int[] dx, dy;

    public static void main(String[] args) throws IOException {
        dx = new int[]{-1,1,0,0};
        dy = new int[]{0,0,-1,1};
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        Graph = new char[R][C];

        String s;
        for(int i=0;i<R;i++) {
            s = bf.readLine();
            Graph[i] =  s.toCharArray();
        }

        int answer = 1;
        for (int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                if(Graph[i][j] == 'W') {
                    for(int k=0;k<4;k++) {
                        int y = i + dy[k];
                        int x = j + dx[k];
                        if((0 <= x && x < C) && (0 <= y && y < R)) {
                            if(Graph[y][x] == '.') Graph[y][x] = 'D';
                            else if(Graph[y][x] == 'S') {
                                answer = 0;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                System.out.print(Graph[i][j]);
            }
            System.out.println();
        }
    }

}