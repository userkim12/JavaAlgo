import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> q = new PriorityQueue<>();
        
        for(int i=0;i<score.length;i++) {
            q.add(score[i]);
            if(i >= k) q.poll();
            answer[i] = q.peek();
        }
        
        return answer;
    }
}