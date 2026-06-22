class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            if(st.isEmpty()) return false;

            if(c == ')'){
                if(st.peek() == '(') st.pop();
                else return false;
                    
            }
            if(c == ']'){
                if(st.peek() == '[') st.pop();
                else return false;
            }
            if(c == '}'){
                if(st.peek() == '{') st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
