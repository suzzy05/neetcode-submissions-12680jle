class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        for (int i = 0; i < l; i++){
            for (int j = i + 1; j < l; j++){
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}