class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, cal = 0;

        for(int i = 1; i <= nums.length; i++){
            sum += nums[i-1];
            cal += i;
        }

        return cal - sum;
    }
}
