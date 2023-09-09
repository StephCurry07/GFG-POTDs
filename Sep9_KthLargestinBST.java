import java.util.ArrayList;
import java.util.List;

public class Sep9_KthLargestinBST {
    void traverse(Node root, List<Integer> list){
        if(root == null)
            return;
        traverse(root.left, list);
        list.add(root.data);
        traverse(root.right, list);
    }
    public int kthLargest(Node root,int K){
        List<Integer> list = new ArrayList();
        traverse(root, list);
        return list.get(list.size() - K);
    }

    public int kthLargest1(Node root, int K) {
    int[] result = new int[]{0, 0}; // An array to hold both the Kth largest value and a counter
    
    kthLargestUtil(root, K, result);
    
    return result[0];
}

    private void kthLargestUtil(Node root, int K, int[] result) {
        if (root == null || result[1] >= K) {
            return;
        }
 
        kthLargestUtil(root.right, K, result);
        
        result[1]++;

        if (result[1] == K) {
            result[0] = root.data;
            return;
        }
        
        kthLargestUtil(root.left, K, result);
    }
}
