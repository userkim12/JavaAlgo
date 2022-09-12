import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for(int i=0;i<n;i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for(int i=1;i<10001;i++){
            while(count[i] != 0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}