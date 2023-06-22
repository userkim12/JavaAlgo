import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> tmp = new ArrayList<>();

        int pointer = 0;
        int idx1 = 0, idx2 = 0;
        int check = 0;

        while (true) {
            if (check >= goal.length) break;

            if (idx1 < cards1.length && cards1[idx1].equals(goal[pointer])) {
                tmp.add(cards1[idx1]);
                idx1++;
            } else if (idx2 < cards2.length && cards2[idx2].equals(goal[pointer])) {
                tmp.add(cards2[idx2]);
                idx2++;
            }
            else return "No";
            check++;
            pointer++;
        }
        
        return "Yes";
    }
}