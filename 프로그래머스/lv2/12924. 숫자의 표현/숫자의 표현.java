class Solution {
    public int solution(int n) {
        int answer = 1;
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        while(end_idx != n) {
            if(sum == n) {
                answer++;
                end_idx++;
                sum += end_idx;
            }
            else if(sum < n) {
                end_idx++;
                sum += end_idx;
            }
            else {
                sum -= start_idx;
                start_idx++;
            }
        }
        return answer;
    }
}