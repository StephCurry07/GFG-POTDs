class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<(a.length/2)*2;i+=2){
            int x=a[i];
            a[i]=a[i+1];
            a[i+1]=x;
        }
        return;
    }
}