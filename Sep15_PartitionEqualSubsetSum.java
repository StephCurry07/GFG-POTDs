class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = Arrays.stream(arr).sum();
        if(sum % 2 != 0)    return 0;
        // System.out.println(sum);
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for(int a : arr){
            for(int i = sum; i >= a; i--){
                dp[i] += dp[i] + dp[i - a];
            }
        }
        if(dp[sum/2] != 0)  return 1;
        else return 0;
    }
}