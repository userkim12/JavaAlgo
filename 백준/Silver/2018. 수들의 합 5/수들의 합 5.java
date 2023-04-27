import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(end_idx != N) {
            if(sum < N) {
                end_idx++;
                sum += end_idx;
            }
            else if(sum > N) {
                sum -= start_idx;
                start_idx++;
            }
            else {
                count++;   
                end_idx++;
                sum += end_idx;
            }
        }
        System.out.println(count);
    }
}