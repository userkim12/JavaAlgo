import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        List<String> list = new ArrayList<>();
        for(char c: arr) list.add(Character.toString(c));
        Collections.sort(list, Collections.reverseOrder());
        String s = String.join("", list);
        return Long.parseLong(s);
    }
}