import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M;i<=N;i++) {
            if(i == 1) continue;
            boolean flag = true;
            
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}