class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;
        while(n >= a) {
            tmp += n % a;
            answer += (n/a)*b;
            n = (n/a) * b + tmp;
            tmp = 0;
        }
        return answer;
    }
}