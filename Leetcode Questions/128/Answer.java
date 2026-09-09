class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int max = 0, sum = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                continue;
            } else if(nums[i] == nums[i + 1] - 1){
                sum++;
            } else{
                sum = 0;
            }
            if(max < sum){
                max = sum;
            }
        }

        return max + 1;
    }
}
