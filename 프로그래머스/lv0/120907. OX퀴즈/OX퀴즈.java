class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++) {
            String[] arr = quiz[i].split(" ");
            int result = Integer.parseInt(arr[arr.length-1]);
            int sum = Integer.parseInt(arr[0]);
            for(int j=1;j<arr.length-2;j+=2) {
                if(arr[j].equals("+")) sum += Integer.parseInt(arr[j+1]);
                else sum -= Integer.parseInt(arr[j+1]);
            }
            if(result == sum) answer[i] = "O";
            else answer[i] = "X";
            
        }
        
        return answer;
    }
}