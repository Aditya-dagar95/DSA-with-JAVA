class Solution {
    public boolean isPalindrome(int x) {
        int y = x, reverse = 0;

        while(y != 0){
            reverse = reverse * 10 + y % 10;
            y /= 10;
        }

        if(x < 0){
            return false;
        }else if( x == reverse){
            return true;
        }else{
            return false;
        }
    }
}
