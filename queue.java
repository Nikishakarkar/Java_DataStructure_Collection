package com.collection;

import java.util.*;

public class queue {

    public static void main(String[] args) {
        System.out.println("___QUEUE_lINKlIST___________");
//fifo - Queue
        Queue<Integer> q = new LinkedList<Integer>();
       //add element in queue [Offer()/add()-if queue empty then exception throw]
        //duplication allow in queue
        q.offer(12);
        q.offer(13);
        q.offer(14);
        q.offer(12);
        System.out.println("Offer()/add()"+q);
        //remove and return element[Poll()/remove()]
        System.out.println("Poll()/remove()"+q.poll());
        System.out.println(q);
        //next first comes out[peek()/element()]
        System.out.println("peek()/element()"+q.peek());

        System.out.println("___PRIORITY_QUEUEE___________");

        PriorityQueue<Integer> pr = new PriorityQueue<Integer>(Comparator.reverseOrder());
        {
            pr.offer(48);
            pr.offer(12);
            pr.offer(13);

            pr.offer(12);
            pr.offer(22);
            pr.offer(15);
            pr.offer(9);

            System.out.println(pr);
            System.out.println("--poll()"+q.poll());
            System.out.println(pr);
            //next first comes out[peek()/element()]
            System.out.println("--peek()"+q.peek());

            System.out.println("_____Learn DEQUE__________");
            ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
            {
                ad.offer(23);
                ad.offerFirst(12);
                ad.offerLast(45);
                ad.offer(26);
                System.out.println(ad);
                System.out.println(ad.peek());
                System.out.println(ad.peekFirst());
                System.out.println(ad.peekLast());

                System.out.println(ad.poll());
                System.out.println(ad);

                System.out.println(ad.pollFirst());
                System.out.println(ad);

                System.out.println(ad.pollLast());
                System.out.println(ad);



            }

        }
    }
}
