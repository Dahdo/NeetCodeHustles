class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int i = 0; 
        int j = s.length() - 1;

        while (i < j) {

            char left = s.toCharArray()[i];
            char right = s.toCharArray()[j];

            if (!isAlphanumeric(left)) {
                i++;
                continue;
            }
            if (!isAlphanumeric(right)) {
                j--;
                continue;
            }
            
            if (left != right) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
