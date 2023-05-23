import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            arr.add(n);
        }

        for(int i: arr) {
            if(i == 1) {
                System.out.println(1);
                continue;
            }
            int cnt = 0;
            for(int j=i+1;j<=i*2;j++) {
                if(isPrime(j)) cnt++;
            }
            System.out.println(cnt);
        }
    }

    static private boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}