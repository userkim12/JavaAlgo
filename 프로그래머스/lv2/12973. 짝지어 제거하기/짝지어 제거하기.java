import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            char c = s.charAt(i);
            if(stk.size() != 0 && stk.peek() == c) {
                stk.pop();
            }
            else stk.push(c);
        }

        return stk.size() == 0 ? 1 : 0;
    }
}