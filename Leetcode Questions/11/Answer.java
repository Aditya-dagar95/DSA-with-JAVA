class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length -1, area = 0, max = 0;
        while(left < right){
            if(height[left] < height[right]){
                area = (right - left) * height[left];
                left++;
            } else if(height[right] < height[left]) {
                area = (right - left) * height[right];
                right--;
            } else{
                area = (right - left ) * height[right];
                left++;
                right--;
            }

            if(area > max){
                max = area;
            }

        }
        return max;
    }
}
