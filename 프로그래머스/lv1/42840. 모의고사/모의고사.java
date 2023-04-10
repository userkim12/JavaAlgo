import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] supo = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        int[] supo_scores = new int[3];
        
        for(int i=0;i<3;i++) {
            supo_scores[i] = isCorrect(supo[i], answers);
        }
        
        int max_score = Math.max(supo_scores[0], Math.max(supo_scores[1], supo_scores[2]));
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<3;i++) {
            if(max_score == supo_scores[i]) list.add(i+1);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
    
    private int isCorrect(int[] supo, int[] answers) {
        int result = 0;
        int cnt = answers.length;
        int supo_idx = 0;
        int answer_idx = 0;
        while(cnt >= 1) {
            if(supo_idx >= supo.length) supo_idx = 0;
            if(supo[supo_idx++] == answers[answer_idx++]) result++;
            cnt--;
        }
        
        return result;
    }
}