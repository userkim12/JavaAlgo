class Solution {
    boolean solution(String s) {
        int[] c = new int[2];
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'p') c[0]++;
            else if(s.charAt(i) == 'y') c[1]++;
        }

        return c[0] == c[1];
    }
}