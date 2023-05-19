import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = IntStream
            .range(0, num_list.length)
            .filter(x->num_list[x] < 0)
            .findFirst()
            .orElse(-1);
        
        return answer;
    }
}