package LinkedList;

public class CircularDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCircular(){
        if (head == null) return false;
        return head.prev == tail && tail.next == head;
        }

    public static void main(String[] args) {
         head = new Node(1);
         Node second = new Node(2);
         Node third = new Node(3);

         head.next = second;
         second.prev = head;

         second.next = third;
         third.prev = second;

         third.next = head;
         head.prev = third;

        tail = third;

        System.out.println(isCircular());
    }
}
