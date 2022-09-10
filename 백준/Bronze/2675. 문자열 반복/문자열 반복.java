import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken();
            for(int j=0;j<c.length();j++){
                String d = String.valueOf(c.charAt(j));
                System.out.print(d.repeat(b));
            }
            System.out.println();
        }

    }
}
