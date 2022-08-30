//import java.util.LinkedList;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main (String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
    //Reversing a queue
    public static void reverse(Queue<Integer> que){
        //Option 1
        Stack<Integer> s = new Stack<>();
        for(int a: que){
            s.push(a);
        }

        int count = 0;
        while(count< que.size()){
            que.remove();
            que.add(s.pop());
            count++;
        }

        //Option 2
        /*
        Stack<Integer> stack = new Stack<>();
        while(!que.isEmpty()){
            stack.push(que.remove());
        }
        while(!stack.isEmpty()){
            que.add(stack.pop());
        }
         */
    }

}
