import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String c: arr) {
            if(c.equals("Z")) list.remove(list.size()-1);
            else list.add(Integer.parseInt(c));
        }
        
        for(int i = 0;i<list.size();i++) answer += list.get(i);
        return answer;
    }
}