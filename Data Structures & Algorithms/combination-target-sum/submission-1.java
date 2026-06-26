class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> n = new ArrayList<>();
        helper(nums, 0, target, new ArrayList<>(), n);
        return n;
    }

    public void helper(int[] nums, int index, int target, List<Integer> l, List<List<Integer>> n){
        if(target == 0){
            n.add(new ArrayList<>(l));
            return;
        }
        if(target < 0) return;
        if(index == nums.length) return;

        l.add(nums[index]);
        helper(nums, index, target - nums[index], l, n);
        l.remove(l.size() - 1);
        helper(nums, index + 1, target, l, n);

    }
}
