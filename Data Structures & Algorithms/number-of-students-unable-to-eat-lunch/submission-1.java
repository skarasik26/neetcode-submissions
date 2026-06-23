class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        if(sandwiches.length == 0) return students.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int sand : sandwiches){
            st.add(sand);
        }
        Queue<Integer> line = new ArrayDeque<>();
        for(int student : students){
            line.add(student);
        }
        int ignored = 0;
        while(st.isEmpty() == false && ignored < line.size()){
            if(st.peek() == line.peek()){
                ignored = 0;
                st.pop();
                line.poll();
            }
            else {
                line.add(line.poll());
                ignored++;
            }
        }
        return line.size();
    }
}