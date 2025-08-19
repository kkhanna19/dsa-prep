package Stack;


import java.util.LinkedList;
import java.util.Queue;

public class StackTwoQueue {

    static class stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();


        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void push(int data){      //O(2n)--> O(N)
//            s1 ---> s2
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }

//           data --> s1
            q1.add(data);

//           s2 --> s1
            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public int pop(){
            if(q1.isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return q1.remove();
        }

        public int peek(){
            if(q1.isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
       stack q = new stack();
        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}

