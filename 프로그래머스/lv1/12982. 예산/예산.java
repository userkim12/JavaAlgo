import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        Arrays.sort(d);
        for(int i: d) {
            if(budget - i >= 0) {
                cnt++;
                budget -= i;
            }
            else break;
        }
        return cnt;
    }
}