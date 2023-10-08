public class Oct7_PairwiseSwapLL {
    public Node pairwiseSwap(Node head){
        Node ans = new Node(0);
        Node temp = ans;
        while(head != null && head.next != null){
            Node node = head.next.next;
            ans.next = head.next;
            ans = ans.next;
            ans.next = head;
            ans = ans.next;
            head = node;
        }
        if(head != null)
            ans.next = head;
        else
            ans.next = null;
        return temp.next;
    }
}
