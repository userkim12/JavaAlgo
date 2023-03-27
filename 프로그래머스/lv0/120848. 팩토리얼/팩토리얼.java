class Solution {
    public int solution(int n) {
        int total = 1;
        int count = 1;
        while(total <= n) {
            count++;                
            total *= count;
        }
        return count-1;
    }
}