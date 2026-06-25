class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        helper(nums, target, 0, l, new ArrayList<>());
        return l;
    }

    private void helper(int[]nums, int target, int index, List<List<Integer>> res, List<Integer> cur){
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(target < 0){
            return;
        }
        if(index == nums.length){
            return;
        }

        cur.add(nums[index]);
        helper(nums, target - nums[index], index, res, cur);
        cur.remove(cur.size() - 1);
        helper(nums, target, index+1, res, cur);
    }
}
