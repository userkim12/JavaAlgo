class Solution {
    public int[] solution(int[] arr) {
        int[] X;
        int len = 0;
        for(int i:arr) {
            len += i;
        }
        X = new int[len];
        
        int idx = 0;
        for(int i:arr) {
            for(int j=0;j<i;j++) {
                X[idx++] = i;
            }
        }
        return X;
    }
}