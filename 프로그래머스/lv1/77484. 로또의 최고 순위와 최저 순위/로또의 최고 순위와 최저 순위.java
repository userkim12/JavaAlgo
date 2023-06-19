import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {-1, -1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(6, 1);
        hm.put(5, 2);
        hm.put(4, 3);
        hm.put(3, 4);
        hm.put(2, 5);
        hm.put(1, 6);
        hm.put(0, 6);
        int zero_cnt = 0;
        int correct_cnt = 0;
        // 0을 제외한 현재 순위
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero_cnt++;
                continue;
            }
            for(int j=0;j<win_nums.length;j++) {
                if(lottos[i] == win_nums[j]) correct_cnt++;
            }

        }

        answer[0] = hm.get(zero_cnt + correct_cnt);
        answer[1] = hm.get(correct_cnt);

        return answer;
    }
}