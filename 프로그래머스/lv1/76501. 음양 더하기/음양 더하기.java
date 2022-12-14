class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int ans = 0, i=0;
        for(boolean b: signs) {
            ans += b ? absolutes[i++] : -absolutes[i++];
        }
        
        return ans;
    }
}