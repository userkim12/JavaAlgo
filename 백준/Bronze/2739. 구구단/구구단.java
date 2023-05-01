import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        for(int i=1;i<=9;i++) {
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}