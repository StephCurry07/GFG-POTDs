public class Sep24_duplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList();
        for(int i = 0; i < n; i++){
            arr[arr[i]%n] += n;
        }

        for(int i = 0; i < n; i++){
            if(arr[i]/n >= 2){
                ans.add(i);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
}
