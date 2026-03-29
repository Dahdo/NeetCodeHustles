class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int i = 0; 
        int j = s.length() - 1;

        while (i < j) {

            char left = s.toCharArray()[i];
            char right = s.toCharArray()[j];

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
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
}
