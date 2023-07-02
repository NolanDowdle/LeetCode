// only passes 208/211 cases and goes over time limit
class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int maxDifference = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] <= low) {
                for(int j = i; j < prices.length; j++) {
                    if(prices[j] - prices[i] > maxDifference) {
                        maxDifference = prices[j] - prices[i];
                        low = prices[i];
                    }
                }
            }
        }
        return maxDifference;
    }
}
