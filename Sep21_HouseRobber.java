public class Sep21_HouseRobber {
    public int FindMaxSum(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        int[] dp = new int[n + 1];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
            // System.out.println(dp[i] + " ");
        }
        return dp[n - 1];
    }
}
