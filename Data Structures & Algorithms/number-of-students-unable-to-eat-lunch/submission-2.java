class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        if(sandwiches.length == 0) return students.length;
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();

        for(int s : students){
            q.add(s);
        }
        for(int i = sandwiches.length - 1; i >=0; i--){
            st.add(sandwiches[i]);
        }

        int ignored = 0;
        while(!st.isEmpty() && ignored < q.size()){
            if(q.peek() == st.peek()){
                ignored = 0;
                q.remove();
                st.pop();
            }
            else{
                q.add(q.poll());
                ignored++;
            }
        }
        return q.size();
    }
}