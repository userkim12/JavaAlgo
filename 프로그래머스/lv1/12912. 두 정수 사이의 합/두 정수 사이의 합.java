import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        int mx = a < b ? b : a;
        int min = a < b ? a : b;

        return (long) LongStream.rangeClosed(min, mx).sum();
    }
}