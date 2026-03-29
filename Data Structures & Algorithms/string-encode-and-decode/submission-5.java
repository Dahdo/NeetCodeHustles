class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String str : strs) {
            int length = str.length();
            builder.append(length).append('*').append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0; // beginning of a string seq/content
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '*') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1; // beginning of the content
            j = i + length;
            result.add(str.substring(i, j));

            i = j; // beginning of the next seq
        }

        return result;
    }
}
