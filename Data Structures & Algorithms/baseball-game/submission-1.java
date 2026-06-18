class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int temp = st.pop();
                int t2 = st.peek();
                st.push(temp);
                st.push(temp + t2);
            }
            else if (op.equals("D")){
                st.push(st.peek() * 2);
            }
            else if (op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        for(int s : st){
            sum += s;
        }
        return sum;
    }
}