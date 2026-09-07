class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        boolean fill = false;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(!fill){
                    left = i;
                    fill = true;
                }
                continue;
            } else {
                if(fill){
                    nums[left] = nums[i];
                    nums[i] = 0;
                    i = left;
                    fill = false;
                }
            }
        }

    }
}
