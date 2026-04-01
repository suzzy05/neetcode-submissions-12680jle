class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int[] lef = new int[l];
        int[] rig = new int[l];

        int maxl = 0;
        for (int i = 0; i < l; i++) {
            maxl = Math.max(maxl, height[i]);
            lef[i] = maxl;
        }

        int maxr = 0;
        for (int i = l - 1; i >= 0; i--) {
            maxr = Math.max(maxr, height[i]);
            rig[i] = maxr;
        }

        int water = 0;
        for (int i = 0; i < l; i++) {
            water += Math.min(lef[i], rig[i]) - height[i];
        }

        return water;
    }
}
