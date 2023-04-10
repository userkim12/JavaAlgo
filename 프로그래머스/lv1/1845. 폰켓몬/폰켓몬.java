import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> pokemons = new HashSet<>();
        for(int i:nums) pokemons.add(i);
        
        return Math.min(pokemons.size(), nums.length/2);
    }
}