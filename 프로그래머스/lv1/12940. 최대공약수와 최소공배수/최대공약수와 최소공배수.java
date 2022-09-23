class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = Sol.gcd(n,m);
        answer[1] = (n * m) /answer[0];
        return answer;
    }
}

class Sol {
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}