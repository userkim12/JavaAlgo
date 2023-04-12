import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        int idx = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == ' ') {
                idx = 0;
                continue;
            }
            if(idx == 0 && !Character.isDigit(arr[i]))
                arr[i] = Character.toUpperCase(arr[i]);
            else
                arr[i] = Character.toLowerCase(arr[i]);
            idx++;
        }
        
        return new String(arr);
    }
}