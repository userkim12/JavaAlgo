import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> report_set = new HashSet<>(Arrays.asList(report));

        Map<String, ArrayList<String>> users_with_others = new HashMap<>();
        for(String user: id_list) {
            users_with_others.put(user, new ArrayList<String>());
        }

        Map<String, Integer> check = new HashMap<>();
        for(String s: report_set) {
            String[] tmp = s.split(" ");
            users_with_others.get(tmp[0]).add(tmp[1]);
            check.put(tmp[1], 0);
        }

        for(String s: report_set) {
            String tmp = s.split(" ")[1];
            check.put(tmp, check.get(tmp)+1);
        }

        ArrayList<String> blocked = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: check.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(value >= k) {
                blocked.add(key);
            }
        }

        Map<String, Integer> mailCount = new HashMap<>();
        for(String s: id_list) {
            mailCount.put(s, 0);
        }
        for(String s: blocked) {
            for(Map.Entry<String, ArrayList<String>> entry: users_with_others.entrySet()) {
                String user = entry.getKey();
                ArrayList<String> others = entry.getValue();

                if(others.contains(s)) mailCount.put(user, mailCount.get(user)+1);
            }
        }

        int[] answer = new int[id_list.length];
        for(int i=0;i<id_list.length;i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        
        return answer;
    }
}