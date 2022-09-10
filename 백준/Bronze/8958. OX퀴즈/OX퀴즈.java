import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i=0;i<a;i++){
            int ans = 0;
            int count = 0;
            String ox = br.readLine();
            for(int j=0;j<ox.length();j++){
                if(ox.charAt(j) == 'O') {
                    count++;
                    ans += count;
                }
                if(ox.charAt(j) == 'X') count = 0;
            }
            System.out.println(ans);
        }

    }
}
