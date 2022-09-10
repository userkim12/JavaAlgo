import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        for(int i=1;i<=b.length();i++) {
            int x = a * ((b.charAt(b.length()-i))-'0');
            System.out.println(x);
        }
        System.out.println(a*Integer.parseInt(b));
    }
}