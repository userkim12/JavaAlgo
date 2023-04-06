import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());
        for(Character c: list) sb.append(c);
        return sb.toString();
    }
}