class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        while(n > 0) {
            a += Integer.toString(n%3);
            n /= 3;
        }

        for(int i=0;i<a.length();i++) {
            int d = a.charAt(i) - '0';
            answer += d * Math.pow(3, a.length()-i-1);
        }
        return answer;
    }
}