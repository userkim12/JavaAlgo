class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = "";
        char sign = ' ';
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) tmp += s.charAt(i);
            else sign = s.charAt(i);
        }
        return sign == '-' ? Integer.parseInt(tmp) * -1 : Integer.parseInt(tmp);
    }
}