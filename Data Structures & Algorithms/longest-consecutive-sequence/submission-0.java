class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxLen = 1;
        int curLen = 1;

        for (int i = 1; i < nums.length; i++) {

            // if consecutive
            if (nums[i] == nums[i - 1] + 1) {
                curLen++;
            }

            // if duplicate (like 2,2) just ignore
            else if (nums[i] == nums[i - 1]) {
                continue;
            }

            // not consecutive
            else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 1;
            }
        }

        return Math.max(maxLen, curLen);
    }
}
