import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sep8_BTtoBST {
    public void traverse(Node root, List<Integer> inorder){
        if(root == null)
            return;
        traverse(root.left, inorder);
        inorder.add(root.data);
        traverse(root.right, inorder);
    }
    
    public Node convertToBST(List<Integer> inorder, int[] index, Node root){
        if(root == null)
            return null;
        
        Node left = convertToBST(inorder, index, root.left);
        root.data = inorder.get(index[0]);
        index[0]++;
        Node right = convertToBST(inorder, index, root.right);
        
        return root;
    }
    
    Node binaryTreeToBST(Node root){
        List<Integer> inorder = new ArrayList<>();
        traverse(root, inorder);
        Collections.sort(inorder);
        
        int[] index = {0}; // To keep track of the index in the inorder list
        return convertToBST(inorder, index, root);
    }
}
