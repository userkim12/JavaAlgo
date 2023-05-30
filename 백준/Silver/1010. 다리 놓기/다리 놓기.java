import java.io.*;
import java.util.*;

public class Main {
    static int[][] DP = new int[31][31];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int comb = combination(M, N);
            sb.append(comb).append("\n");
        }
        System.out.println(sb);
    }
    
    private static int combination(int n, int r) {
        if(DP[n][r] > 0) return DP[n][r];
        else if(r == 0 || n == r) return DP[n][r] = 1;
        else return DP[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }
}