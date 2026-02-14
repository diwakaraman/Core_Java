package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    static void main() {
         Queue <Integer> queue= new PriorityQueue(Comparator.reverseOrder());  //comapritor use for biggest element print
        queue.add(40);               //add element
        queue.add(12);
        queue.add(34);
        queue.add(36);
        System.out.println(queue);
     queue.poll();         //top element remove
     System.out.println(queue);
       queue.peek();    //jo element top me  nikalne wala hai vo bahar aa jayega
       System.out.println(queue.peek());
    }
}
