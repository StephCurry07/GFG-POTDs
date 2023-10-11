public class Oct11_isBalancedTree {
    int getHeight(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    boolean isBalanced(Node root){
	    if(root == null){
	        return true;
	    }
	    int h1 = getHeight(root.left);
	    int h2 = getHeight(root.right);
	    boolean leftBalanced = isBalanced(root.left);
	    boolean rightBalanced = isBalanced(root.right);
	    return Math.abs(h1 - h2) <= 1 && leftBalanced && rightBalanced;
    }
}
