class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int a = m + n;

        int[] res = new int[a];
        int r = 0, n1 = 0, n2 = 0;

        for (int i = 0; i < a; i++) {
            if (n1 <= n - 1 && n2 <= m - 1) {
                if (nums1[n1] <= nums2[n2]) {
                    res[r] = nums1[n1];
                    r++;
                    n1++;
                } else{
                    res[r] = nums2[n2];
                    r++;
                    n2++;
                }
            } else if (n1 == n){
                res[r] = nums2[n2];
                r++;
                n2++;
            } else{
                res[r] = nums1[n1];
                n1++;
                r++;
            }
        }

        double median = 0;
        
        if(a%2 == 0){
            median = (res[a/2 - 1] + res[a/2])/2.0;
        } else{
            median = res[a/2];
        }
        return median;
    }
}
