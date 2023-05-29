import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int n = gcd(A,B);
            sb.append(A*B/n).append("\n");
        }
        System.out.println(sb);

    }

    static private int gcd(int A, int B) {
        while(B > 0) {
            int r = A % B;

            A = B;
            B = r;
        }

        return A;
    }
}