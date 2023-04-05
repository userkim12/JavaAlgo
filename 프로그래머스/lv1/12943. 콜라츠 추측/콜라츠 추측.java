class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num != 1) {
            if(answer >= 500 || num < 1) return -1;
            
            if(num % 2 == 0) {
                num /= 2;
                answer++;
            }
            else if(num % 2 == 1) {
                num = (num * 3) + 1;   
                answer++;
            }
            
        }
        return answer;
    }
}