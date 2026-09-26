class Solution {
    public boolean canTransform(int[] source, int[] target) {

        long sorelanuxi = 0; 
        long sumSource = 0, sumTarget = 0;

        for (int i = 0; i < source.length; i++) {
            sorelanuxi += source[i]; 
            sumSource += source[i];
        }
        for (int t : target) {
            sumTarget += t;
        }

        return sumSource == sumTarget;
    }
}©leetcode
