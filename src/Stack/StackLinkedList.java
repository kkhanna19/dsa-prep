package Stack;

import java.util.ArrayList;

public class StackLinkedList {
       static class Node{
                int data;
                Node next;
                Node(int data){
                    this.data = data;
                    this.next = null;
                }
        }




        public static void main(String[] args) {
            Stack.Stack.StackOperations s = new Stack.Stack.StackOperations();
            s.push(1);
            s.push(2);
            s.push(3);

            while (!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
    }

}
