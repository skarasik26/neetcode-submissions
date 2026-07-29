class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int total = 0;
        for(String op : operations){
            if(op.equals("+")){
                int temp = st.pop();
                int temp2 = st.peek() + temp;
                st.push(temp);
                st.push(temp2);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek() * 2);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        for(Integer s : st){
            total+=s;
        }
        return total;
    }
}