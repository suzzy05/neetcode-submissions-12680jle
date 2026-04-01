class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] r= new int[l];
        for (int i=0 ; i<l; i++){
            int p=1;
            for (int j=0; j<l;j++){
                if (i!=j)
                {
                    p=p*nums[j];
                }
            }
            r[i]=p;
        }
        return(r);
    }
}