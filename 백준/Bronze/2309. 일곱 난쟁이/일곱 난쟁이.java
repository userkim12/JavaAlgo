import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<9;i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
            sum += n;
        }
        Collections.sort(list);
        for(int i=0;i<8;i++) {
            for(int j=i+1;j<9;j++) {
                if(sum - list.get(i)-list.get(j) == 100) {
                    list.remove(j);
                    list.remove(i);

                    for(int k=0;k<list.size();k++) {
                        System.out.println(list.get(k));
                    }
                    System.exit(0);
                }
            }
        }
    }
}