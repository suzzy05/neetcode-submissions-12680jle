class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] res= new int[l];
        int p=1;
        for (int i = 0; i < l; i++) {
            res[i] = p;
            p *= nums[i];
        }
        int right = 1;
        for (int i = l - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        return res;
    }
}