public class Jul5_Buyandsellstock2 {
    public static int buyandsell(int[] prices, int n){
        int curr = prices[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > curr) {
                profit += prices[i] - curr;
                curr = prices[i];
            }
            if (prices[i] <= curr)
                curr = prices[i];
        }
        return profit;
    }
}
