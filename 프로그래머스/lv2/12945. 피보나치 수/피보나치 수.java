class Solution {
    public int solution(int n) {
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i=2;i<n+1;i++) {
            int tmp = fibo[i-1] + fibo[i-2];
            fibo[i] = tmp % 1234567;
        }
        return fibo[n];
    }
}