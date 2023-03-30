import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        int len = my_str.length();
        for(int i=0; i<len/n; i++) {
            list.add(my_str.substring(i*n, (i+1)*n));
        }
        if(len % n != 0) {
            list.add(my_str.substring(n*(len/n), len));
        }
        return list.toArray(new String[0]);
    }
}