class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
             int n1 = nums1.length;
            int n2 = nums2.length;


            int[] arr = new int[n1 + n2];

            for(int i = 0; i < n1; i++) {
                arr[i] = nums1[i];
            }

            for(int i = 0; i < n2; i++) {
                arr[n1 + i] = nums2[i];
            }

            Arrays.sort(arr);

            int len = arr.length;

            if(len % 2 == 0) {
                double m = arr[len/2 - 1] + arr[len/2];
                return m / 2.0;
            }
            else {
                return arr[len/2];
            }
        }
        }
