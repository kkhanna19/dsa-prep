package Queues;

public class CircularQueue {
    static class cQueue{
        int arr[];
        int size;
        int rear;
        int front;

        cQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty(){

            return rear == -1 && front == -1;
        }

        public boolean isFull(){

            return (rear+1) % size == front;     //rear = front
        }

        public void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1 ;
            }
            int result = arr[front];

            //last element delete
            if(rear == front){
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        cQueue c = new cQueue(3);
        c.add(1);
        c.add(2);
        c.add(3);

        System.out.println(c.remove());
        c.add(4);
        System.out.println(c.remove());
        c.add(5);
//        System.out.println(c.remove());
        c.add(6);

        while (!c.isEmpty()){
            System.out.println(c.peek());
            c.remove();
        }
    }
}
