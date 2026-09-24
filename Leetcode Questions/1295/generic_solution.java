class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] < 100 && nums[i] > 9){
                count++;
            }else if(nums[i] < 10000 && nums[i] > 999){
                count++;
            } else if(nums[i] < 1000000 && nums[i] > 99999){
                count++;
            }
        }

        return count;
    }
}
