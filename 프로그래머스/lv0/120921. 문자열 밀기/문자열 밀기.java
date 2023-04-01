class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;
        int answer = 0;
        String s = A;
        for(int i=0;i<A.length();i++) {
            s = s.substring(s.length()-1, s.length()) + s.substring(0, s.length()-1);
            answer++;
            if(s.equals(B)) return answer;
            
        }
        return -1;
    }
}