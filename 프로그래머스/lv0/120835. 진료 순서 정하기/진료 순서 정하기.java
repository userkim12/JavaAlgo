import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergency_copy = emergency.clone();
        
        Arrays.sort(emergency_copy);
        for(int i=0;i<emergency.length;i++) {
            for(int j=0;j<emergency.length;j++) {
                if(emergency[j] == emergency_copy[i]) answer[j] = emergency.length-i;
            }
        }
        
        return answer;
    }
}