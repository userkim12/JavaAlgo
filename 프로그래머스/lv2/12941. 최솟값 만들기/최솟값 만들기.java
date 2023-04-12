import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Integer[] B_ = new Integer[B.length];
        for(int i=0;i< B_.length;i++) B_[i] = B[i];
        Arrays.sort(B_, Collections.reverseOrder());
        
        for(int i=0;i<A.length;i++) {
            answer += A[i] * B_[i];
        }        


        return answer;
    }
}