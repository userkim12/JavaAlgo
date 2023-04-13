import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        int person_num = 2;
        int[] turn = new int[n+1];
        turn[1]++;
        Set<String> previous = new HashSet<>();
        previous.add(words[0]);
        
        for(int i=1;i<words.length;i++) {
            turn[person_num]++;
            if(previous.contains(words[i])) 
                break;
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
                break;
            
            person_num++;
            previous.add(words[i]);
            
            if(person_num > n) person_num = 1;
        }
        
        if(previous.size() == words.length) return new int[]{0,0};
        return new int[]{person_num, turn[person_num]};
    }
}