public class Sep10_insertNodeinBST {
    Node insert(Node root, int key) {
        if(root == null){
            Node temp = new Node(key);
            return temp;
        }
        if(root.data > key){
            root.left = insert(root.left, key);
        }
        if(root.data < key){
            root.right = insert(root.right, key);
        }
        return root;
    }
}
