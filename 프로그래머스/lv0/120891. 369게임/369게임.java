class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        for(int i=0;i<s.length();i++) {
            int num = s.charAt(i)-'0';
            if(num != 0 && num % 3 == 0) answer++;
        }
        return answer;
    }
}