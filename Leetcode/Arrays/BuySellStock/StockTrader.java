/* LeetCode 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example: 
prices = [7, 1, 5, 3, 6, 4]
output = 5
*/

public class StockTrader {
    // One Pass approach
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // largest difference so far 
        int minPrice = Integer.MAX_VALUE; // best buy day so far
    
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
    // time complextity: O(n)
    // space complextity: O(1)

    // Brute Force approach
    public int maxProfitNaive(int[] prices) {
        int maxProfit = 0;

        for (int buyDay = 0; buyDay<prices.length; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay<prices.length; sellDay++) {
                int currentDifference = prices[sellDay] - prices[buyDay];
                if (currentDifference > maxProfit) {
                    maxProfit = currentDifference;
                }
            }
        }

        return maxProfit;
    }
    // time complexity = O(n^2)
    // space complexity = O(1)
}
