import java.util.stream.IntStream;

class Solution {
    String ans = "";
    public String solution(int n) {
        IntStream.rangeClosed(1,n).forEach(i -> ans += i % 2 == 0 ? "박" : "수");
        return ans;
    }
}