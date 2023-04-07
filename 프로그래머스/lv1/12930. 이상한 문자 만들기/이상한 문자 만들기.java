class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        int cnt = 0;
        while(cnt < s.length()) {
            String tmp = String.valueOf(s.charAt(cnt));
            if(tmp.equals(" ")) {
                idx = 0;
                answer += " ";
                cnt++;
                continue;
            }
            answer += idx % 2 == 0 ? tmp.toUpperCase() : tmp.toLowerCase();
            cnt++;
            idx++;
        }
        return answer;
    }
}