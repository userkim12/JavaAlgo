class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        int count = 0;
        for(int i=len-1; i>=0;i--) {
            answer[i] = num_list[count++];
        }
        
        return answer;
    }
}