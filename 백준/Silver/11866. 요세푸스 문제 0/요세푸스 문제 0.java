import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=N;i++) {
            list.add(i);
        }

        while(!list.isEmpty()) {
            for(int i=1;i<K;i++) {
                list.addLast(list.removeFirst());
            }
            sb.append(list.removeFirst()).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);

    }
}