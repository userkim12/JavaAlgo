import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.charAt(0) == ')') return false;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '(') stk.push(c);
            else if(c == ')' && stk.size() != 0) stk.pop();

        }
        

        return stk.size() == 0;
    }
}