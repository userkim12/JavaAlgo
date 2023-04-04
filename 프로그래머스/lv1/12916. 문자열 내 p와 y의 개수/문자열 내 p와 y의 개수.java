class Solution {
    boolean solution(String s) {
        String ss = s.toLowerCase();
        int p = ss.length() - ss.replace("p", "").length();
        int y = ss.length() - ss.replace("y", "").length();
        if(p == y) return true;
        else return false;
    }
}