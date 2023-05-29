import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[N];
        for(int i=0;i<N;i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);

        int[] total = new int[N];
        total[0] = time[0];
        for(int i=1;i<N;i++) {
            int tmp = 0;
            for(int j=0;j<=i;j++) {
                tmp += time[j];
            }
            total[i]= tmp;
        }
        System.out.println(Arrays.stream(total).sum());

    }
}