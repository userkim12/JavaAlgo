class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int d = s.length()/2;
        
        if(s.length() % 2 == 0) sb.append(s.charAt(d-1));
        sb.append(s.charAt(d));
        
        return sb.toString();
    }
}