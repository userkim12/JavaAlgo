class Solution {
    public int solution(int a, int b) {
        String sA = String.valueOf(a);
        String sB = String.valueOf(b);
        String comb = sA + sB;
        
        if(Integer.parseInt(comb) > 2 * a * b) return Integer.parseInt(comb);
        else return 2 * a * b;
    }
}