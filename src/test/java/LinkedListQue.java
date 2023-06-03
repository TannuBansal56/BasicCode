public class LinkedListQue {
    Node head;

    class Node{
        Node next;
        int  data;
        Node(int  data){
            this.data = data;
            this.next = null;
        }
    }

    Node reverseLinkedList(Node head){
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        else if(head.next.next == null){
            Node curr = head.next;
            curr.next = head;
            head = null;
            return curr;

        }
        else {
            Node curr = head.next;
            Node prev = head;
            Node next = curr.next;
            while(next!=null && curr!=null ){
               // curr.next =
            }
        }
    return null;

    }
    void add(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public static void main(String args[]){
        LinkedListQue linkedList = new LinkedListQue();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
    }
}
