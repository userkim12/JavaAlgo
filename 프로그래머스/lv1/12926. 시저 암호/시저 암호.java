class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c: s.toCharArray()){
            if(c == ' ') answer += c;
            else if('a' <= c && c <= 'z'){
                answer += (char)('a'+(c-'a'+n)%26);
            }
            else if(Character.isUpperCase(c)){
                answer += (char)('A'+(c-'A'+n)%26);
            }
        }
        return answer;
    }
}