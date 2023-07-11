import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int right = people.length-1;
        int left = 0;

        while(right >= left) {
            if(people[right] + people[left] > limit) {
                ans++;
                right--;
            }
            else {
                ans++;
                left++; right--;
            }
        }
        
        return ans;
    }
}