import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y-x;
            int mx = (int) Math.sqrt(distance);

            if(mx == Math.sqrt(distance)) sb.append(2*mx-1).append("\n");
            else if(distance <= Math.pow(mx, 2)+mx) sb.append(2*mx).append("\n");
            else sb.append(2*mx+1).append("\n");
        }
        System.out.println(sb);
    }
}