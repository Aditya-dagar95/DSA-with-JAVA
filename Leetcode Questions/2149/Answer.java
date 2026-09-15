class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        boolean positive_turn = true;

        for (int i = 0, j = 0, k = 0; k < nums.length; ) {
            if (i < nums.length && nums[i] <= 0){ 
                i++; continue; 
            }
            if (j < nums. length && nums[j] > 0){ 
                j++; continue; 
            }

            if (positive_turn){ 
                arr[k++] = nums[i++]; 
            }
            else{ 
                arr[k++] = nums[j++]; 
            }

            positive_turn = !positive_turn;
        }

        return arr;
    }
}
