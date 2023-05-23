import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int o = N;

        int a=0, b=0, c=0, d=0, cnt=0;
        while(true) {
            a = N / 10;
            b = N % 10;
            c = a + b;
            N = Integer.parseInt(String.valueOf(b) + String.valueOf(c%10));
            cnt++;

            if(o == N) break;

        }
        System.out.println(cnt);

    }
}