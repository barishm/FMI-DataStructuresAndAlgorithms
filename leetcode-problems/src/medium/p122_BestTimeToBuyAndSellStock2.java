package medium;

public class p122_BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = {1,9,6,9,1,7,1,1,5,9,9,9};
        int i = maxProfit(prices);
        System.out.println(i);

    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int future = 1;
        boolean bought = false;
        boolean buyLastDay = false;
        if(prices.length < 2){
            return profit;
        }
        for (int i = 0; i < prices.length; i++) {
            if(prices[future] > prices[i] && !bought){
                profit -= prices[i];
                bought = true;
            }
            else if(buyLastDay || bought) {
                profit += prices[i];
                bought = false;
                if(prices[future] > prices[i]){
                    profit -= prices[i];
                    bought = true;
                }
            }
            if(i != prices.length-2){
                future++;
            }else if(prices[future] > prices[i]) {
                buyLastDay = true;
            }

        }
        return profit;
    }
}
