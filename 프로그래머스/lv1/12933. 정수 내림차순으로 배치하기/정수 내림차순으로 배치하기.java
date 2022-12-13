import java.util.*;

class Solution {
    public long solution(long n) {
        String[] s = Long.toString(n).split("");
        Arrays.sort(s, Collections.reverseOrder());
    
        StringBuilder sb = new StringBuilder();
        Arrays.stream(s).mapToInt(Integer::parseInt).forEach(e->sb.append(e));
        
        return Long.parseLong(sb.toString());
        
        
    }
}