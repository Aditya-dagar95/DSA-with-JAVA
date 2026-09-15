class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftOK = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightOK = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if(leftOK && rightOK){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        if(n <= 0){
            return true;
        } else{
            return false;
        }
    }
}
