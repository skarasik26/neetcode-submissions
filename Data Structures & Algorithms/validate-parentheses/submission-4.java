class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            String sub = s.substring(i,i+1);
            if(!st.empty()){
                if(sub.equals(")") && st.peek().equals("(")){
                    st.pop();
                }
                else if(sub.equals("]") && st.peek().equals("[")){
                    st.pop();
                }
                else if(sub.equals("}") && st.peek().equals("{")){
                    st.pop();
                }
                else st.push(sub);
            }
            else st.push(sub); 
            
        }
        return st.isEmpty();

    }
}
