import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    int tmp = nums[i] + nums[j] + nums[k];
                    if(isPrime(tmp)) answer ++;
                }
            }
        }

        return answer;
    }
    
    private boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}