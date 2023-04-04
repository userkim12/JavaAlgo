import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        char[] arr = Long.toString(n).toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)  list.add(arr[i]);
        System.out.println(arr[0]);
        Collections.reverse(list);
        
        return list.stream().mapToInt(m->m-48).toArray();
    }
}