class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String str : strs) {
            int length = str.length();
            builder.append(length).append('#').append(str);
        }

        return builder.toString();
    }


    public List<String> decode(String str) {
        List<String> strs = new LinkedList<>();

        int i = 0; // the word beginning
        while (i < str.length()) {
            int j = i; 
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;
            j = i + length;

            strs.add(str.substring(i, j));
            i = j;
        }

        return strs;
    }
}
