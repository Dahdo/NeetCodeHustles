class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            mapS.put(a, mapS.getOrDefault(a, 0) + 1);
            mapT.put(b, mapT.getOrDefault(b, 0) + 1);
        }
        
        return mapS.equals(mapT);

    }
}
