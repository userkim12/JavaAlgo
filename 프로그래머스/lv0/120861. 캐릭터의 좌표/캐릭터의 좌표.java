import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] coordinate = {0,0};
        for(String key: keyinput) {
            switch(key) {
                case "up":
                    coordinate[1]++;
                    break;
                case "down":
                    coordinate[1]--;
                    break;
                case "left":
                    coordinate[0]--;
                    break;
                case "right":
                    coordinate[0]++;
                    break;
            }
            if(coordinate[0] < (board[0]/2)*-1) coordinate[0] = (board[0]/2)*-1;
            if(coordinate[0] > board[0]/2) coordinate[0] = board[0]/2;
            if(coordinate[1] < (board[1]/2)*-1) coordinate[1] = (board[1]/2)*-1;
            if(coordinate[1] > board[1]/2) coordinate[1] = board[1]/2;
        }
        
        return coordinate;
    }
}