import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int val;
            if(command.equals("push")) {
                val = Integer.parseInt(st.nextToken());
                q.add(val);
            }
            else if(command.equals("pop")) {
                if(q.isEmpty()) sb.append("-1").append("\n");
                else sb.append(q.pop()).append("\n");
            }
            else if(command.equals("front")) {
                if(q.isEmpty()) sb.append("-1").append("\n");
                else sb.append(q.getFirst()).append("\n");;
            }
            else if(command.equals("back")) {
                if(q.isEmpty()) sb.append("-1").append("\n");
                else sb.append(q.getLast()).append("\n");;
            }
            else if(command.equals("empty")) {
                if(q.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            }
            else if(command.equals("size")) {
                sb.append(q.size()).append("\n");
            }
        }
        System.out.println(sb);
    }
}