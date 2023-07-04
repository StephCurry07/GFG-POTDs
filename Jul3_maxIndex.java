public class Jul3_maxIndex{
/************ Mine(Better) **************/
    int maxIndexDiff(int arr[], int n) {
        int winsize = 0;
        for(int i = 0; i < n; i++){
            int start = i;
            int end = n - 1;
            while(end >= i && arr[i] > arr[end]){
                end--;
            }
            winsize = Math.max(winsize, end - start);
            if(i > winsize)
                break;
        }
        return winsize;
    }
/*********** Optimal **********/
    int maxIndexDiff1(int arr[], int n) {
        int winsize = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.min(left[i-1], arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int i = n - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int l = 0, r = 0;
        while(l < n && r < n){
            int start = left[l];
            int end = right[r];
            if(start <= end){
                winsize = Math.max(winsize, r - l);
                r++;
            }
            else{
               l++;
            }
        }
        return winsize;
    }
}