import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> iStack = new Stack<>();
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            int val;
            String command = st.nextToken();
            if(command.equals("push")) {
                val = Integer.parseInt(st.nextToken());
                iStack.push(val);
            }
            else if(command.equals("pop")) {
                if(iStack.size()==0) System.out.println(-1);
                else System.out.println(iStack.pop());
            }
            else if(command.equals("top")) {
                if(iStack.size()==0) System.out.println(-1);
                else System.out.println(iStack.peek());
            }
            else if(command.equals("size")) {
                System.out.println(iStack.size());
            }
            else if(command.equals("empty")) {
                if(iStack.size()==0) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}