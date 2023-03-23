import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        
        for(;i<=j;i++) {
            s += String.valueOf(i);
        }
        
        String[] arr = s.split("");
        
        return Collections.frequency(Arrays.asList(arr), String.valueOf(k));
    }
}