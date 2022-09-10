import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        StringBuilder AA = new StringBuilder();
        StringBuilder BB = new StringBuilder();

        for(int i=2;i>=0;i--){
            AA.append(A.charAt(i));
            BB.append(B.charAt(i));
        }

        int AAA = Integer.parseInt(AA.toString());
        int BBB = Integer.parseInt(BB.toString());

        System.out.println(AAA>BBB?AAA:BBB);
    }
}