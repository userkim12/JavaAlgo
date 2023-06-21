import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 3진법으로 변환된 수를 저장하는 변수
        StringBuilder sb = new StringBuilder();
        
        // n이 3으로 나눌 필요 없을 때까지 loop
        // 조건에 0이 아닌 1 이상의 수가 들어갈 경우 마지막 몫이 포함이 안 됨
        while(n > 0) {
            // 3진수로 변환
            sb.append(n%3);
            n /= 3;
        }
        
        // StringBuilder에 append된 수들을 하나씩 확인할 수 있게 String으로 변환
        String s = sb.toString();
        
        // 변환된 문자열을 통해 3->10진법으로 변환
        for(int i=0;i<s.length();i++) {
            answer += (s.charAt(i)-'0') * Math.pow(3, s.length()-i-1);
        }
        
        return answer;
    }
}