import java.util.*;

class Solution {
    public long solution(long n) {
        double tmp = Math.sqrt(n);
        if(Math.ceil(tmp) == tmp && Math.floor(tmp) == tmp) return (long) Math.pow(tmp+1, 2);
        return -1;
    }
}