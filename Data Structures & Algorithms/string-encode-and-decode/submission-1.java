class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(String s : strs) {
            int lenS = s.length();
            String appendS = lenS + "#" + s;
            encodedStr.append(appendS);
        }

        return encodedStr.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        StringBuilder numBuilder = new StringBuilder();

        int i = 0; 
        while (i < str.toCharArray().length) {
            if (Character.isDigit(str.charAt(i))) {
                numBuilder.append(str.charAt(i));
                i++;
            }
            else if (str.charAt(i) == '#') {
                int count = Integer.parseInt(numBuilder.toString());
                String subS = str.substring(i + 1, i + count + 1);
                i += count + 1;
                numBuilder.setLength(0);

                list.add(subS);
            }
            else {
                i++;
            }
            
        }

        return list;

    }
}
