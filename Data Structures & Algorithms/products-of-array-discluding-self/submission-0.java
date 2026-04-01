class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        int zeroCount = 0;

        for (int n : nums) {
            if (n == 0) {
                zeroCount++;
            } else {
                p *= n;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                nums[i] = 0;
            } else if (zeroCount == 1) {
                nums[i] = (nums[i] == 0) ? p : 0;
            } else {
                nums[i] = p / nums[i];
            }
        }

        return nums;
    }
}
