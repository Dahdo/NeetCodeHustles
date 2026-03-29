class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] tableS = new int[26];
        int[] tableT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tableS[s.charAt(i) - 'a']++;
            tableT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(tableS, tableT);
    }
}
