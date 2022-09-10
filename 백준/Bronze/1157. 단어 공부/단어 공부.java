import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'A']++;
        }
        int mx = -9999;
        int index = 0;
        for(int i=0;i<26;i++){
            if (mx < alpha[i]){
                mx = alpha[i];
                index = i;
            }
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(mx == alpha[i]) count++;
        }
        if(count != 1) System.out.println("?");
        else System.out.println((char)(index+'A'));
    }
}
