import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] a = before.split("");
        String[] b = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        String before_s = String.join("", a);
        String after_s = String.join("", b);
        
        if(before_s.equals(after_s)) return 1;
        return 0;
    }
}