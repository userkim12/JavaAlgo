import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(num_list[i]);
        return arr.stream().mapToInt(x->x).toArray();
    }
}