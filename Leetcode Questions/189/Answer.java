class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0){
            return;
        } else if(k % nums.length == 0){
            return;
        }

        int[] arr = new int[nums.length];
        int j = nums.length, start = -1;

        while(k != 0){
            if(k > nums.length){
                k -= nums.length;
                continue;
            }
            if( start == -1){
                start = k;
            }
            
            j--;
            k--;
        }

        int endpt = j;

        for(int i = 0; j < arr.length; i++){
            arr[i] = nums[j];
            j++;
        }

        for(int i = 0; i < endpt; i++){
            arr[start] = nums[i];
            start++;
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = arr[i];
        }

        return;
    }
}
