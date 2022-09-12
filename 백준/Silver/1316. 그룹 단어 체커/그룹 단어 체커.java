import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int ans = 0;

        for(int i=0;i<a;i++) {
            String s = br.readLine();
            int prev = 0;
            boolean isGroup = true;
            boolean[] alphaCheck = new boolean[26];

            for(int j=0;j<s.length();j++){
                int now = s.charAt(j)-'a';
                if(alphaCheck[now]){
                    if(prev != now){
                        isGroup = false;
                        break;
                    }
                }
                else alphaCheck[now] = true;
                prev = now;
            }
            if(isGroup) ans++;
        }
        System.out.println(ans);
    }
}