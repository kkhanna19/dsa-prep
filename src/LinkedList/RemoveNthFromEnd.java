package LinkedList;

public class RemoveNthFromEnd {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void removeFromEnd(int n){
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node curr = head;
        while (i < iToFind){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
    }

    public static void main(String[] args) {
        RemoveNthFromEnd ll = new RemoveNthFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.removeFromEnd(3);
        ll.print();
    }
}
