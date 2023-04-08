import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] command: commands) {
            int len = command[1] - command[0] + 1;
            int[] tmp_arr = new int[len];
            System.arraycopy(array, command[0]-1, tmp_arr, 0, len);
            Arrays.sort(tmp_arr);
            list.add(tmp_arr[command[2]-1]);
            
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}