class Solution {
    public long solution(String numbers) {
        String[] zero_to_nine = {"zero", "one", "two", 
                                 "three", "four", "five", 
                                 "six", "seven", "eight", "nine"};
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i=0;i<zero_to_nine.length;i++) {
            numbers = numbers.replace(zero_to_nine[i], String.valueOf(nums[i]));
        }
        
        return Long.parseLong(numbers);
    }
}