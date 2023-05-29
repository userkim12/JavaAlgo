class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int a = gcd(n,m);
        int b = (n*m) / a;
        return new int[]{a,b};
    }
    
    private int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            
            a = b;
            b = r;
        }
        
        return a;
    }
}