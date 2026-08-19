package practiceTime;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInStream {
    public static void main(String[] args) {
        int a[] = {7, 4, 5, 6, 10, 7};
        int k = 3;
        System.out.println(" Kth element");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (var el : a) {
            queue.add(el);

            if (queue.size() > k) {
                queue.poll();

            }
        }
            System.out.println(queue.peek());


        }

}