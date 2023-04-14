class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(n > 1) {
            n /= 2;
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
            
            if(a == b) break;
        }
        

        return answer;
    }
}