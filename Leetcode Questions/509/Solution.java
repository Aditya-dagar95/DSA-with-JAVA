class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }

        int result = 1, num = 0;

        for(int i = 1; i < n; i++){
            int temp = result;
            result += num;
            num = temp;
        }

        return result;
    }
}
