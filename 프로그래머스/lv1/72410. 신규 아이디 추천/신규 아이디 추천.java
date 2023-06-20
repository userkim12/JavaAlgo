class Solution {
    public String solution(String new_id) {
        String id = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "");

        while (id.contains("..")) {
            id = id.replace("..", ".");
        }
        if (id.charAt(0) == '.') {
            id = id.replaceFirst(".", "");
        }
        if(id.length()!=0) {
            if (id.charAt(id.length() - 1) == '.') {
                id = id.substring(0, id.length() - 1);
            }
        }
        if (id.length() == 0) {
            id = "a";
        }
        if(id.length() >= 16) {
            id = id.substring(0, 15);
        }
        if(id.length()!=0) {
            if (id.charAt(id.length() - 1) == '.') {
                id = id.substring(0, id.length() - 1);
            }
        }
        if(id.length() <= 2) {
            id += String.valueOf(id.charAt(id.length()-1)).repeat(3-id.length());
        }
       return id;
    }
}