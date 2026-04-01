class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        // find max pile
        for (int p : piles) {
            right = Math.max(right, p);
        }
        
        int ans = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            long hours = 0;
            for (int p : piles) {
                hours += (p + mid - 1) / mid; // ceil division
            }
            
            if (hours <= h) {
                ans = mid;
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1; // need faster speed
            }
        }
        
        return ans;
    }
}   
