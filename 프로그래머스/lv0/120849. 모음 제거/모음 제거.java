class Solution {
    public String solution(String my_string) {
        String[] gather = {"a", "e", "i", "o", "u"};
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            for(int j=0;j<5;j++) {
                if(gather[j].charAt(0) == c) break;
                if(j >= 4) sb.append(c);
            }
        }

        return sb.toString();
    }
}