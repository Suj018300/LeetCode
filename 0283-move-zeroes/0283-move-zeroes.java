class Solution {
    public void moveZeroes(int[] nums) {
        
        int count =0;
        int n = nums.length;
        for (int i = 0; i<n; i++) {
            if (nums[i] == 0) {
                count++;
            } else if (count > 0) {
                int t = nums[i];
                nums[i] =0;
                nums[i-count] = t;
            }
        }
    }
}