package Stack;
import java.util.*;

public class NextGreaterElement {
    static Stack<Integer> s;
   static int[] result;
    
    public static void nextGreaterRight(int[] arr) {
        s.clear(); //reset stack
        result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //if-else
            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[s.peek()];
            }

            //push
            s.push(i);
        }
        System.out.println("Next Greater Right: " + Arrays.toString(result));    }

    public static void nextGreaterLeft(int[] arr) {
        s.clear(); //reset stack
        result = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            // while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //if-else
            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[s.peek()];
            }

            //push
            s.push(i);
        }
        System.out.println("Next Greater Left: " + Arrays.toString(result));

    }
    public static void nextSmallerRight(int[] arr){
        s.clear(); //reset stack
        result = new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            // while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            //if-else
            if(s.isEmpty()){
                result[i] = -1;
            }
            else {
                result[i] = arr[s.peek()];
            }

            //push
            s.push(i);
        }
        System.out.println("Next Smaller Right: " + Arrays.toString(result));

    }
    public static void nextSmallerLeft(int[] arr) {
        s.clear(); //reset stack
        result = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            // while
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            //if-else
            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[s.peek()];
            }

            //push
            s.push(i);
        }
        System.out.println("Next Smaller Left: " + Arrays.toString(result));

    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        s = new Stack<>();

        nextGreaterRight(arr);
        nextGreaterLeft(arr);
        nextSmallerRight(arr);
        nextSmallerLeft(arr);
    }
}
