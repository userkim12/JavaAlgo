import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] s = Long.toString(n).split("");
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for(int i = s.length-1;i>=0;i--){
            sb.append(s[i]);
        }
        Long answer = Long.parseLong(sb.toString());
        return answer;
    }
}