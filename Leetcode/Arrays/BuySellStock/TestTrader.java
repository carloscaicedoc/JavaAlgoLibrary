public class TestTrader {
    public static void main(String[] args) {
        StockTrader stockTrader = new StockTrader();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(stockTrader.maxProfit(prices));
        System.out.println(stockTrader.maxProfitNaive(prices));
    }    
}
