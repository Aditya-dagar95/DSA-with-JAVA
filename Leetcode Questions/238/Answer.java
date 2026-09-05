class Solution {
    int ArrMulti(int j, int[] nums){
            int res = 1;
            for(int i = 0; i < nums.length; i++){
                if(i == j){continue;}
                res *= nums[i];
            }
        return res;
    }

    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];
        int res = 1;
        boolean first = true;

        for(int i = 0; i<nums.length; i++){
            res *= nums[i];
        }

        for(int i = 0; i < answer.length; i++){
            if(nums[i] == 0){
                if(first){
                    answer[i] = ArrMulti(i, nums);
                    first = false;
                } else{
                    answer[i] = 0;
                }
                continue;
            }
            answer[i] = res/nums[i];
        }
        return answer;
    }
}
