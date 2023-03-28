class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = "0";
        for(int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if(Character.isDigit(c)) tmp += c;
            else {
                answer += Integer.parseInt(tmp);
                tmp = "0";
            }
        }
        answer += Integer.parseInt(tmp);
        return answer;
    }
}