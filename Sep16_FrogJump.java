public class Sep16_FrogJump {
    private static final int MOD = (int)1e9 + 7;

    static long countWays(int n){
        if(n <= 2)  return n;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%MOD;
        }
        return dp[n] % MOD;
    }
}
