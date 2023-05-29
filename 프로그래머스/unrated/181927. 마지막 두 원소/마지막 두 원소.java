import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len+1];
        System.arraycopy(num_list, 0, answer, 0, len);

        int ans_last = answer.length-1;
        if(answer[ans_last-1] > answer[ans_last-2]) answer[ans_last] = answer[ans_last-1] - answer[ans_last-2];
        else answer[ans_last] = answer[ans_last-1] * 2;

        return answer;
    }
}