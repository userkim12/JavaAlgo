class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0;i<rsp.length();i++) {
            String str = String.valueOf(rsp.charAt(i));
            answer += str.equals("2") ? "0" : (str.equals("0") ? "5" : "2");
        }
        return answer;
    }
}