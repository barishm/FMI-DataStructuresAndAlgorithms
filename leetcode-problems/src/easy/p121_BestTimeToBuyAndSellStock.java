package easy;

public class p121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,2,5,3,6,4,1,4};
        int i = maxProfit2(prices);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]-prices[i] > maxProfit) {
                    maxProfit = prices[j]-prices[i];
                }
            }
        }

        return maxProfit;
    }
    public static int maxProfit2(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minVal){
                minVal = prices[i];
            }
            else if(prices[i] - minVal > maxProfit) {
                maxProfit = prices[i] - minVal;
            }
        }
        return maxProfit;
    }
}
