import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n % i == 0) {
                int num = n / i;
                if(num == i) answer += i;
                else answer += i + num;
            }
        }
        return answer;
    }
}