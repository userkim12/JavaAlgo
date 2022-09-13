import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'0']++;
        }
        for(int i=9;i>=0;i--){
            while(nums[i] != 0){
                sb.append(i);
                nums[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}