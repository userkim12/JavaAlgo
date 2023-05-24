import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++) {
            String ps = br.readLine();
            Stack<Character> stk = new Stack<>();
            for(int j=0;j<ps.length();j++) {
                char c = ps.charAt(j);
                if(c == '(') stk.push(c);
                else  {
                    if(stk.isEmpty()) {
                        stk.push(c);
                        break;
                    }
                    else {
                        stk.pop();
                    }
                }
            }
            if(stk.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }
}