import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        if(len <= 1)return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        
        int[] answer = new int[len-1];
        int index = 0;
        for(int i=0;i<len;i++){
            if(arr[i] == min) continue;
            else {
                answer[index] = arr[i];
                index++;
            } 
        }
        return answer;
    }
}