import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> dq = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        for(int i=1;i<=N;i++) {
            dq.add(i);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            int n = Integer.parseInt(st.nextToken());
            arr.add(n);
        }

        int cnt = 0;
        for(int i: arr) {
            int idx = dq.indexOf(i);
            int mid = dq.size() / 2;

            if(idx > mid) {
                while(i != dq.getFirst()) {
                    cnt++;
                    dq.addFirst(dq.removeLast());
                }
            }
            else {
                while(i != dq.getFirst()) {
                    cnt++;
                    dq.addLast(dq.removeFirst());
                }
            }
            dq.removeFirst();
        }
        System.out.println(cnt);
    }
}