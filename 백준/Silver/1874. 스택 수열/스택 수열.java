import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> iStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int start = 1;

        for(int i=0;i<T;i++) {
            int n = Integer.parseInt(br.readLine());
            for(int j=start;j<=n;j++) {
                iStack.push(j);
                sb.append("+\n");
            }

            if(start <= n) start = n+1;

            if(iStack.peek().equals(n)) {
                iStack.pop();
                sb.append("-\n");
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}