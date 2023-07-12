import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();

        for(int i=0;i<speeds.length;i++) {
            Q.add((int) Math.ceil((100-progresses[i]) / (double) speeds[i]));
        }

        int prev = Q.poll();
        int count = 1;
        while (!Q.isEmpty()) {
            if (prev >= Q.peek()) {
                Q.poll();
                count++;
            } else {
                list.add(count);
                count = 1;
                prev = Q.poll();
            }
        }
        list.add(count);

        return list.stream().mapToInt(x->x).toArray();
    }
}