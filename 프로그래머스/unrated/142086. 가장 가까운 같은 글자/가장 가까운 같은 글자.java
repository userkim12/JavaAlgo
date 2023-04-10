class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        char[] c = s.toCharArray();
        for(int i=1;i<s.length();i++) {
            int cnt = 0;
            boolean check = false;
            for(int j=i-1;j>=0;j--) {
                cnt++;
                if(c[i] == c[j]) {
                    check = true;
                    break;   
                }
            }
            answer[i] = check ? cnt:-1;
        }
        
        return answer;
    }
}