import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> iStack = new Stack<>();
        int sum = 0;
        for(int i=0;i<N;i++) {
            int a = Integer.parseInt(br.readLine());
            if(a == 0) sum -= iStack.pop();
            else {
                iStack.push(a);
                sum += a;
            }
        }
        System.out.println(sum);
    }
}