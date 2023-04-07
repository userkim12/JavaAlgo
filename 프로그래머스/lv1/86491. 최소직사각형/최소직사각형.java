import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] maxi = new int[]{-1,-1};
        
        for(int i=0;i<sizes.length;i++) Arrays.sort(sizes[i]); 
        
        for(int i=0;i<sizes[0].length;i++) {
            for(int j=0;j<sizes.length;j++) {
                maxi[i] = Math.max(sizes[j][i], maxi[i]);
            }
        }
        
        return maxi[0] * maxi[1];
    }
}