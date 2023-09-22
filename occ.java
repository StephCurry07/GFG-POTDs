class occ
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        boolean first=true;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x && first)
            {
                first=false;
                list.add(i);
            }
            if(arr[i]==x)
                idx=i;
        }
        if(first)
            list.add(-1);
         list.add(idx);
         return list;
    }
}
