import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i);
            if(a < 68) ans += 3;
            else if(a < 71) ans += 4;
            else if(a < 74) ans += 5;
            else if(a < 77) ans += 6;
            else if(a < 80) ans += 7;
            else if(a < 84) ans += 8;
            else if(a < 87) ans += 9;
            else ans += 10;
        }
        System.out.println(ans);
    }
}