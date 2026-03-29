class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(String s : strs) {
            encodedStr.append(s.length())
            .append("#")
            .append(s);
        }

        return encodedStr.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i = 0; 
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') { // important bcz the length might very long i.e not just a single number
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;

            list.add(str.substring(i, j));
            i = j;
            
        }

        return list;

    }
}
