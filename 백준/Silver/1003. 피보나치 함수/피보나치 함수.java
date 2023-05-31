import java.io.*;
import java.util.*;
public class Main {
    static Integer[] DP = new Integer[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        DP[0] = 0;
        DP[1] = 1;

        for(int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());

            fibo(N);
            if(N == 0) sb.append("1 0" + "\n");
            else if(N == 1) sb.append("0 1" + "\n");
            else sb.append(DP[N - 1]).append(" ").append(DP[N]).append("\n");
        }
        System.out.println(sb);
    }

    private static int fibo(int N) {
        if (DP[N] == null) {
            DP[N] = fibo(N-1) + fibo(N-2);
        }

        return DP[N];
    }
}