import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};

        int min_idx = 0;
        int min = 999999999;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++) {
            if(min > arr[i]) {
                min_idx = i;
                min = arr[i];
            }
        }
        
        
        for(int i=0;i<arr.length;i++) {
            if(i == min_idx) continue;
            list.add(arr[i]);
        }
        
        return list.stream().mapToInt(x->x).toArray();
    }
}