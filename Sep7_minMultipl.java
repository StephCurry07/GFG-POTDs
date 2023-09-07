public class Sep7_minMultipl {
    int minimumMultiplications(int[] arr, int start, int end) {
        Queue<Integer> q = new LinkedList();
        boolean[] check = new boolean[(int)1e5 + 1];
        int count = 0;
        q.offer(start);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int num = q.poll();
                if(num == end){
                    return count;
                }
                for(int a : arr){
                    int next = (num * a)% 100000;
                    if(!check[next]){
                        q.offer(next);
                        check[next] = true;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
