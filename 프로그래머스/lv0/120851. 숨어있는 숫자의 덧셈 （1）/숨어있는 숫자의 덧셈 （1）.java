class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            int val = c-'0';
            if(0 <= c-'0' && c-'0'<=9) answer += val;
        }
        
        return answer;
    }
}