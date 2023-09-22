import java.util.ArrayList;

public class Sep22_firstandlastocc{
    ArrayList<Integer> find(int arr[], int n, int x){
        ArrayList<Integer> ans = new ArrayList();
        int low = 0;
        int high = n - 1;
        int fo = -1;
        int lo = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
               fo = mid;
               high = mid - 1;
            }
            if(arr[mid] > x){
                high = mid - 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
        }
        low = 0;
        high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                lo = mid;
                low = mid + 1;
            }
            if(arr[mid] > x){
                high = mid - 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
        }
        if(ans.isEmpty()){
            ans.add(fo);
            ans.add(lo);
        }
        return ans;
    }
}