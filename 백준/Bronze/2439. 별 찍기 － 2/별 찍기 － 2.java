import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i=1;i<=N;i++) {
                System.out.print(" ".repeat(N-i));
                System.out.print("*".repeat(i));
                System.out.println();
        }

    }
}