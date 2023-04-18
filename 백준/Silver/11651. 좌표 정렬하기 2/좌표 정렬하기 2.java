import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return Integer.compare(o1[0], o2[0]);
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for(int i=0;i<N;i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}