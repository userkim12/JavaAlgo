import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0;i<players.length;i++) {
            hm.put(players[i], i);
        }
        
        for(String calling: callings) {
            int calledRank = hm.get(calling);
            int nextRank = calledRank - 1;
            String nextRunner = players[nextRank];
            players[nextRank] = calling;
            players[calledRank] = nextRunner;
            hm.put(nextRunner, calledRank);
            hm.put(calling, nextRank);
        }
        return players;
    }
}