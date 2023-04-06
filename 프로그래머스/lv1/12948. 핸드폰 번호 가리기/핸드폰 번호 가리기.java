class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length() - 4;
        answer += "*".repeat(len) + phone_number.substring(len, len+4);
        return answer;
    }
}