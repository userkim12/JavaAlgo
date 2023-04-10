class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<food.length;i++) {
            if(food[i] > 1) {
                sb.append(String.valueOf(i).repeat(food[i] / 2));
            }
        }
        answer += sb.toString() + "0";
        answer += sb.reverse();
        return answer;
    }
}