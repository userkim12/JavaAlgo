import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int tmp1 = -2100000000, tmp2 = 0;
        if(numbers[0] < 0 && numbers[1] < 0) tmp1 = numbers[0] * numbers[1];
        tmp2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        return tmp1<tmp2 ? tmp2:tmp1;
    }
}