class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n>1)
        dp[2]=2;
        if(n>2)
        dp[3]=4;
        for(int i=4;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
        }
        return dp[n];
    }
    
}

