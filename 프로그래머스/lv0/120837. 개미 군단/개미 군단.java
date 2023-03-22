class Solution {
    public int solution(int hp) {
        int[] ants = {5,3,1};
        int answer = 0;
        int count = 0;
        
        for(int i:ants) {
            answer += hp / i;
            hp %= i;
        }
        
        return answer;
    }
}