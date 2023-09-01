import java.util.ArrayDeque;
import java.util.Queue;

class Tree{
    public static void printCorner(Node node){
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node temp = queue.poll();
                if(i == 0 || i == size - 1){
                    System.out.print(temp.data + " ");
                }
                
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
    }
}