import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0;i<N;i++) {
            int num = i;
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum+i == N) {
                answer = N-sum;
                break;
            }
        }
        System.out.println(answer);
    }
}