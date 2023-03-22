class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if(97 <= c && c <= 122) {
                String s = Character.toString(c);
                answer.append(s.toUpperCase());
            }
            else if(65 <= c && c <= 90) {
                String s = Character.toString(c);
                answer.append(s.toLowerCase());
            }
            else answer.append(c);
        }
        
        return answer.toString();
    }
}