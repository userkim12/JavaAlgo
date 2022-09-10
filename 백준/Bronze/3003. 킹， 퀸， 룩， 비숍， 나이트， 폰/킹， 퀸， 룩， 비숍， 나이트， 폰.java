import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[6];
        int[] chess = {1,1,2,2,2,8};
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0;i<6;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<6;i++){
            System.out.print(chess[i]-nums[i] + " ");
        }

    }
}
