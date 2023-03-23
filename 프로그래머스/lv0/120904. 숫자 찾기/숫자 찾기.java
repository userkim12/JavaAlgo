class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int count = 1;
        String s = String.valueOf(num);
        
        for(int i=0;i<s.length();i++) {
            int n = s.charAt(i)-'0';
            if(n == k) {
                answer = count;
                break;
            }
            count++;
        }
        return answer <= 0 ? -1:answer;
    }
}