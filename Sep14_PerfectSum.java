public class Sep14_PerfectSum {
    private final static int MOD = (int)1e9 + 7;
	public int perfectSum(int arr[],int n, int sum) { 
	    int[] dp = new int[sum + 1];
	    dp[0] = 1;
	    for(int a : arr){
	        for(int i = sum; i >= a; i--){
	            dp[i] = (dp[i] + dp[i - a])%MOD;
	        }
	    }
	    return dp[sum]%MOD;
	}
}
