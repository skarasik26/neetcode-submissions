class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> n = new ArrayList<>();
        helper(nums, 0, n, new ArrayList<>());
        return n;
    }

    private void helper(int[] nums, int index, List<List<Integer>> n, List<Integer> t){
        if(index == nums.length) {
            n.add(new ArrayList<>(t));
            return;
        }

        t.add(nums[index]);
        helper(nums, index + 1, n, t);
        t.remove(t.size() - 1);
        helper(nums, index + 1, n, t);
        

    }
}
