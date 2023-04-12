class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        String mx = "-999999";
        String min = "999999";
        for(int i=0;i<nums.length;i++) {
            int num = Integer.parseInt(nums[i]);
            if(Integer.parseInt(mx) < num) mx = nums[i];
            if(Integer.parseInt(min) > num) min = nums[i];
        }
        
        return min + " " + mx;
    }
}