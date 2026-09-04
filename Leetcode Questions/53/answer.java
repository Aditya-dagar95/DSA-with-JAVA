class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int min = 99999;
        int max = 0;
        int profit = 0;
        for(int num : prices){
            if(min > num){
                min = num;
                max = 0;
            } else if(max < num){
                max = num;
            }
            if(max - min > profit){
                profit = max - min;
            }
        }
        return profit;
    }
}
