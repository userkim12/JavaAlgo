class Solution {
    public int solution(int n, String control) {
        char[] commands = control.toCharArray();
        for(char c: commands) {
            switch(c) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}