class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String word = "";
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(" ")) {
                idx = 0;
                word += " ";
            }
            else if(idx % 2 == 0) {
                word += arr[i].toUpperCase();
                idx++;
            }
            else if(idx % 2 != 0){
                word += arr[i].toLowerCase();
                idx++;
            }
            
        }
        return word;
    }
}