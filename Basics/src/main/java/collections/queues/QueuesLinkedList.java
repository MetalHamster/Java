package collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesLinkedList {
    /*
    Order by insertion
     */
    public static void main(String[] args) {
        Queue<Integer> queueList = new LinkedList<>();

        queueList.add(2);
        queueList.add(1);
        queueList.add(5);
        queueList.add(4);
        queueList.add(3);

        System.out.println(queueList);

        queueList.remove();

        System.out.println(queueList);
    }
}
