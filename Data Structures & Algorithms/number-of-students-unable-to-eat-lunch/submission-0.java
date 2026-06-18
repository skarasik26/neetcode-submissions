class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentLine = new LinkedList<>();
        for(int student : students){
            studentLine.add(student);
        }
        int j = 0;
        int refused = 0;
        int remainingStudents = students.length;
        while(refused < remainingStudents){
            if(studentLine.peek() == sandwiches[j]){
                studentLine.remove();
                remainingStudents--;
                j++;
                refused = 0;
            }
            else{
                studentLine.add(studentLine.remove());
                refused++;
            }
        }
        int count = 0;
        for(int student : studentLine){
            count++;
        }
        return count;
    }
}