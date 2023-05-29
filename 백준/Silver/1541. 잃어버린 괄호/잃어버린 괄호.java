import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String[] sub = s.split("-");
        int answer = Integer.MAX_VALUE;
        for(int i=0;i<sub.length;i++) {
            String[] add = sub[i].split("\\+");

            int sum = 0;
            for(int j=0;j<add.length;j++) {
                sum += Integer.parseInt(add[j]);
            }

            if(answer == Integer.MAX_VALUE) answer = sum;
            else answer -= sum;
        }
        System.out.println(answer);
    }
}