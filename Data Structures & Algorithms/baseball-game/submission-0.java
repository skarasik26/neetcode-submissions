class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        int s = 0;
        for(int i = 0; i < operations.length; i++){
            switch(operations[i]){
                case "+":
                    int temp = score.pop();
                    int sum = temp + score.peek();
                    score.push(temp);
                    score.push(sum);
                    break;
                case "C":
                    score.pop();
                    break;
                case "D":
                    int temp1 = 2 * score.peek();
                    score.push(temp1);
                    break;
                default:
                    score.push(Integer.parseInt(operations[i]));
                    break;
            }
        }
        for(int num : score){
            s+= num;
        }
        return s;
    }
}