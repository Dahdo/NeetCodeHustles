class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            }
            else if ( c == ']' || c == ')' || c == '}') {
                if (stack.size() == 0) {
                    return false;
                }
                char popped = stack.pop();
                if (c == ']' && popped != '[') {
                    return false;
                }
                else if (c == ')' && popped != '(') {
                    return false;
                }
                else if (c == '}' && popped != '{') {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
