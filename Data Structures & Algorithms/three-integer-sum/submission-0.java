class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);

                        set.add(triplet);
                    }
                }
            
            }
       }
       return new ArrayList<>(set);
    }
}  



