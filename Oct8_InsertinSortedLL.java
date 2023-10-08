public class Oct8_InsertinSortedLL {
    Node sortedInsert(Node head1, int key) {
        Node dummy = new Node(0);
        dummy.next = head1;
        Node temp = head1;
        if(key < temp.data){
            dummy.next = new Node(key);
            dummy.next.next = temp;
            return dummy.next;
        }
        Node prev = new Node(0);
        prev.next = temp;
        Node node = new Node(key);
        while(temp.next != null && temp.next.data < key){
            temp = temp.next;
            prev = prev.next;
        }
        node.next = temp.next;
        temp.next = node;
        return dummy.next;
    }
}
