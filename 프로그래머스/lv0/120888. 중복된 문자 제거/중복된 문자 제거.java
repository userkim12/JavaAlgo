import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if(hs.contains(c)) 
                continue;
            else {
                answer += String.valueOf(c);
                hs.add(c);
            }    
        }
        
        return answer;
    }
}