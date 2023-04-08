import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> list = new LinkedHashSet<>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        return list.stream().mapToInt(x->x).sorted().toArray();
    }
}