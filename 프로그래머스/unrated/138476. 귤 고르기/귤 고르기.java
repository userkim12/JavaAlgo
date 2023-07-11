import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: tangerine) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((x,y)->map.get(y).compareTo(map.get(x)));

        for(int i: keys) {
            if(k <= 0) break;
            answer++;
            k -= map.get(i);
        }
        
        return answer;
    }
}