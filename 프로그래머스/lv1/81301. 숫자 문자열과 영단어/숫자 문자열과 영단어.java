class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tmp = s;
        for(int i=0;i<numbers.length;i++) {
            tmp = tmp.replace(numbers[i], String.valueOf(i));
        }
        
        return Integer.parseInt(tmp);
    }
}
