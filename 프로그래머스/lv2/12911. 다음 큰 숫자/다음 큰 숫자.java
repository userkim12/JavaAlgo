class Solution {
    public int solution(int n) {
        for(int i=n+1;i<=1000000;i++) {
            if(Integer.bitCount(i) == Integer.bitCount(n))
                return i;
        }
        
        return 0;
    }
}