import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 666;
        while(N > cnt) {
            String s = String.valueOf(num++);
            if(s.contains("666")) cnt++;
        }
        System.out.println(num-1);
    }
}