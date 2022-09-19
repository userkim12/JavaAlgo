import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] li = new int[1000];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                li[index] = arr[i];
                index++;
            }
        }
        int[] answer = Arrays.copyOfRange(li,0,index);
        Arrays.sort(answer);
        if(answer.length == 0)return new int[]{-1};
        return answer;
        
    }
}