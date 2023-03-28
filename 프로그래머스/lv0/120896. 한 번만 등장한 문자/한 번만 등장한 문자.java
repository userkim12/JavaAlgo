class Solution {
    public String solution(String s) {
        int[] alpha = new int[26];
        String answer = "";
        for(int i=0;i<s.length();i++) {
            int c = s.charAt(i)-'a';
            alpha[c]++;
        }
        
        for(int i=0;i<26;i++) {
            if(alpha[i] == 1) answer += (char) (i+'a');
        }

        return answer;
    }
}