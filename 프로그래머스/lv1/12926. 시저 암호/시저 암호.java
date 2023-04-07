class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                char changed_c = (char) (c+n);
                if(changed_c > 'z') changed_c = (char) (changed_c - 26);
                answer += changed_c;
            }
            else if(Character.isUpperCase(c)) {
                char changed_c = (char) (c+n);
                if(changed_c > 'Z') changed_c = (char) (changed_c - 26);
                answer += changed_c;
            }
            else answer += c;
            
        }
        return answer;
    }
}