import java.util.*;

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int len = s.length();
        int[] answer = new int[len];
        for(int i=len-1;i>=0;i--) {
            answer[i] = s.charAt(len-i-1)-'0';
        }

        return answer;
    }
}