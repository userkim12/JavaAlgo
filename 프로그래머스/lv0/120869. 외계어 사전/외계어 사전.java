import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        ArrayList<String> list = new ArrayList<>();
        for(String word: dic) {
            int cnt = 0;
            for(String alpha: spell) {
                if(word.length() - word.replace(alpha, "").length() > 1) break;
                cnt += word.length() - word.replace(alpha, "").length();
            }
            
            if(cnt == word.length() && word.length() == spell.length) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}