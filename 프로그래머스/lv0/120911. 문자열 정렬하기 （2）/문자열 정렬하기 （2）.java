import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        String answer = String.join("", arr);
        return answer;
    }
}