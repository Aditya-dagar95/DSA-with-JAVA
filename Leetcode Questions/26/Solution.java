class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 1){return 1;}
        if(nums.length == 2 && (nums[0] != nums[1])){return 2;}

        int res[] = new int[nums.length];
        int j = 0, k =0;
        boolean first = true;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(first){
                k++;
                first = false;
            }

            if(nums[i] != nums[i+1]){
                nums[++j] = nums[i + 1];
                k++;
            }
        }  
        return k;
    }
}
