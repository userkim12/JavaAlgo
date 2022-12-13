class Solution {
    public int solution(long num) {
        int check = 0;
        //loop
        while(num != 1){
            // num %2 == 0 -> /2
            if(num % 2 == 0) num /= 2;
            // num %2 != 0 -> *3 + 1
            else num = num*3+1;
            check++;
        }
        if (check > 499) return -1;
        return check;
        
    }
}