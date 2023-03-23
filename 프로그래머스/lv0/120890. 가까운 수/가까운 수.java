import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num = 9999;
        Arrays.sort(array);
        for(int i:array) {
            if(num > Math.abs(i-n)) {
                answer = i;
                num = Math.abs(i-n);
            }
        }
        return answer;
    }
}