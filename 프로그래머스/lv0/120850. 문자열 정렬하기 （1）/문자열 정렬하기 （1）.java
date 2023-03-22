import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] tmp = new int[10];
        int count = 0;
        
        for(int i=0; i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if(Character.isDigit(c)) {
                tmp[count++] = c-'0';
            }
        }
        
        int[] answer = new int[count];
        System.arraycopy(tmp, 0, answer, 0, count);
        Arrays.sort(answer);
        
        return answer;
    }
}