import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cro = br.readLine();

        String[] li = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String s: li){
            if(cro.contains(s)){
               cro = cro.replace(s, "@");
            }
        }
        System.out.println(cro.length());
    }
}