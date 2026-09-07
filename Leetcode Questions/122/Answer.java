class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, curr = 99999;

        for(int i = 0; i < prices.length;){
            if(prices[i] < curr){
                curr = prices[i];
            }
            if(curr < prices[i]){
                profit += (prices[i] - curr);
                curr = 99999;
                continue;
            }
            i++;
        }

        return profit;
    }
}
