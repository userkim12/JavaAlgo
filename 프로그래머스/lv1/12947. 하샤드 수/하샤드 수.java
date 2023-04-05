class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String x2s = String.valueOf(x);
        for(int i=0;i<x2s.length();i++) {
            sum += x2s.charAt(i)-'0';
        }
        return x % sum == 0;
    }
}