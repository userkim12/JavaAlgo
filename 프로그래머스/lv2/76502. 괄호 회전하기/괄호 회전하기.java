import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++) {
            if(isGoodBracket(s)) answer++;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }

    private boolean isGoodBracket(String s) {
        Stack<Character> S = new Stack<>();
        try {
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(c == '[' || c == '{' || c == '(') S.add(c);
                else if(c == ']' && S.peek() == '[') S.pop();
                else if(c == '}' && S.peek() == '{') S.pop();
                else if(c == ')' && S.peek() == '(') S.pop();
            }
        } catch(Exception e) {
            return false;
        }

        return S.isEmpty();
    }
}