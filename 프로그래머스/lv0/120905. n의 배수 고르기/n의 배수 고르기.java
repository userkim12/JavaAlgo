class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] tmp = new int[numlist.length];
        int count = 0;
        
        for(int i: numlist) {
            if(i%n == 0) tmp[count++] = i;
        }
        
        int[] answer = new int[count];
        System.arraycopy(tmp, 0, answer, 0, count);
        return answer;
    }
}