class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        while(n >= 1) {
            int idx = --n;
            answer[idx] = x * ((long)n+1);
        }
        return answer;
    }
}