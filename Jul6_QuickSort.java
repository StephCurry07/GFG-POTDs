public class Jul6_QuickSort {
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p_ind = partition(arr, low, high);
            quickSort(arr, low, p_ind - 1);
            quickSort(arr, p_ind + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < high && arr[i] <= pivot)
                i++;
            while (j > low && arr[j] > pivot)
                j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}