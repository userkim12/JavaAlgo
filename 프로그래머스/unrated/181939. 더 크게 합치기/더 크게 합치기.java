class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        String tmp1 = aa + bb;
        String tmp2 = bb + aa;
        int iTmp1 = Integer.parseInt(tmp1);
        int iTmp2 = Integer.parseInt(tmp2);
        if(iTmp1 > iTmp2) return iTmp1;
        else return iTmp2;
    }
}