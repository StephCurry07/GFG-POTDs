public class Jul4_subarrayProdlessthank {
     public int countSubArrayProductLessThanK(long a[], int n, long k){
        int count = 0;
        long prod = 1;
        int len = 0;
        for(int i = 0; i < n; i++){
            len++;
            prod = prod * a[i];
            while(len != 0 && prod >= k){
                prod = prod/a[i - len + 1];
                len--;
            }
            count += len;
        }
        return count;
    }
}
