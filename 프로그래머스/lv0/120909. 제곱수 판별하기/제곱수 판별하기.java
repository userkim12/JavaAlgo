import java.util.*;

class Solution {
    public int solution(int n) {
        double d = Math.sqrt(n);
        
        return d == Math.round(d)?1:2;
    }
}