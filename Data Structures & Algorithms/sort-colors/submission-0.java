class Solution {
    public void sortColors(int[] nums) {
        int[] counts = {0, 0, 0};

        for(int n : nums){
            counts[n]++;
        }

        int n = 0;

        for(int i = 0; i < counts.length; i++){
            for(int j = 0; j < counts[i]; j++){
                nums[n] = i;
                n++;
            }
        }
    }
}