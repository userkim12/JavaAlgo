import java.util.*;

class Solution {
    public int solution(int slice, int n) {
        double d = Math.ceil((double) n / slice);
        return (int) d;
    }
}