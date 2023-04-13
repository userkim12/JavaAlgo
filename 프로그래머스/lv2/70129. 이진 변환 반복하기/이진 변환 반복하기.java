class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero_count = 0;
        String new_s = s;
        while(!new_s.equals("1")) {
            count++;
            String tmp = "";
            for(int i=0;i<new_s.length();i++) {
                char c = new_s.charAt(i);
                if(c == '0') {
                    zero_count++;
                    continue;
                }
                tmp += c;
            }
            
            int withoutZero_length = tmp.length();
            String new_binary_reverse = "";
            while(withoutZero_length != 1) {
                new_binary_reverse += String.valueOf(withoutZero_length % 2);
                withoutZero_length = withoutZero_length / 2;
            }
            new_binary_reverse += String.valueOf(withoutZero_length);
            
            String new_binary = "";
            for(int i=new_binary_reverse.length()-1;i>=0;i--) {
             new_binary += new_binary_reverse.charAt(i);   
            }
            new_s = new_binary;
            System.out.println(new_s);
        }
        
        return new int[]{count, zero_count};
    }
}