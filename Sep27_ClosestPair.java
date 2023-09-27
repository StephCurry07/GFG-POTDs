import java.util.ArrayList;
import java.util.List;

public class Sep27_ClosestPair{
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int ptr1 = 0;
        int ptr2 = m - 1;
        int ptr3 = n - 1;
        int ptr4 = 0;
        int min1 = 0;
        int min2 = 0;
        int min = Integer.MAX_VALUE;
        while(ptr1 < n && ptr2 >= 0){
            if(Math.abs(arr[ptr1] + brr[ptr2] - x) < min){
                min = Math.abs(arr[ptr1] + brr[ptr2] - x);
                min1 = arr[ptr1];
                min2 = brr[ptr2];
                ptr2--; 
            }
            else{
                ptr1++;
            }
        }
        
        return new ArrayList<Integer>(List.of(min1, min2));
    }
}