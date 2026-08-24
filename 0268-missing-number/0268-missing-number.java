class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Tsum = (n * (n+1)) /2;
        int actSum = Arrays.stream(nums).sum();
        return Tsum-actSum;
    }
}