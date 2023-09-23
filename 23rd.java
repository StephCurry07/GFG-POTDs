class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        if(n==1)
            return 1;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        long tot=arr[n-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==tot-arr[i])
                return i+1;
        }
        return -1;
        // Your code here
    }
}