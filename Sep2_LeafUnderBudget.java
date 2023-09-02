import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sep2_LeafUnderBudget {
    public void traverse(Node root, List<Integer> leaves, int level){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            leaves.add(level);
        }
        traverse(root.left, leaves, level + 1);
        traverse(root.right, leaves, level + 1);
    }
    public int getCount(Node node, int bud){
        List<Integer> list = new ArrayList();
        traverse(node, list, 1);
        Collections.sort(list);
        int count = 0;
        for(int a : list){
            bud -= a;
            if(bud >= 0){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
