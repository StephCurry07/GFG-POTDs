public class Sep23_EquilibriumPoint {

public static int equilibriumPoint1(long arr[], int n) {
    long[] pre = new long[n];
        pre[0] = arr[0];
        for(int i = 1; i < n; i++){
            pre[i] += pre[i-1] + arr[i];
        }
        long sum = 0;
        for(int i = n - 1; i >= 0; i--){
            sum += arr[i];
            if(sum == pre[i])
                return i + 1;
        }
        return -1;
    }

public static int equilibriumPoint2(long arr[], int n) {
    long ls = arr[0];
        long rs = arr[n-1];
        int i = 0;
        int j = n - 1;
        while(i <= j){
            if(ls == rs){
                if(i == j){
                    return i + 1;
                }
                else{
                    i++;
                    j--;
                    ls += arr[i];
                    rs += arr[j];
                }
            }
            if(ls < rs){
                i++;
                ls += arr[i];
            }
            if(ls > rs){
                j--;
                rs += arr[j];
            }
        }
        return -1;
    }
}
