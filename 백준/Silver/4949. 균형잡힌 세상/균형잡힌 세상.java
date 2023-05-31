import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();

        while(true) {
            String s = br.readLine();

            if(s.equals(".")) break;

            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(c == '[' || c == '(') stk.push(c);
                else if(c == ')') {
                    if(!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    }
                    else stk.push(c);
                }
                else if(c == ']') {
                    if(!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                    }
                    else stk.push(c);
                }
            }

            if(stk.size() == 0) sb.append("yes\n");
            else sb.append("no\n");
            stk.clear();
        }
        System.out.println(sb);
    }
}