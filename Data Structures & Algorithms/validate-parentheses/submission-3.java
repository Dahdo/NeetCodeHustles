class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.size() == 0) {
                    return false;
                }
                char popped = stack.pop();
                if (c == ')' && popped != '(') {
                return false;
                }
                else if (c == '}' && popped != '{') {
                    return false;
                }
                else if (c == ']' && popped != '[') {
                    return false;
                }
            }

        }

        return stack.size() == 0;
    }
}
