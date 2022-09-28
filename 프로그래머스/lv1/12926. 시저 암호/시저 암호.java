class Solution {
    public String solution(String s, int n) {
        String[] arr = s.split("");
        String answer = "";
        for(String o: arr){
            //String to char
            int a = (int)o.charAt(0);
            //공백은 그대로 두기
            if(o.equals(" ")) answer += o;
            //대문자
            else if(a >= 65 && a<= 90){
                //밀린 문자
                int m = a+n;
                if(m > 90) m -= 26;
                String p = Character.toString((char)m);
                answer += p;
            }
            //소문자
            else {
                //밀린 문자
                int m = a+n;
                if(m > 122) m -= 26;
                String p = Character.toString((char)m);
                answer += p;
            }
        }
        return answer;
    }
}