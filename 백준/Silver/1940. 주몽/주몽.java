import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        
        for(int i=0;i<N;i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A);
        
        int start = 0;
        int end = N-1;
        int count = 0;
        while(start < end) {
            int armor = A[start] + A[end];
            if(armor == M) {
                count++;
                start++;
                end--;
            }
            else if(armor > M) end--;
            else start++;
        }
        
        System.out.println(count);
    }
}