import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int r2 = Integer.parseInt(st.nextToken());

            double dis = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
            int sum = r1 + r2;
            int sub = Math.abs(r1-r2);

            if(dis == 0 && r1 == r2) sb.append("-1").append("\n");
            else if(dis > sum || dis < sub) sb.append("0").append("\n");
            else if(dis == sum || dis == sub) sb.append("1").append("\n");
            else sb.append("2").append("\n");
        }
        
        System.out.println(sb);
    }
}