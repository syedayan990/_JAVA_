package in.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();

      q.add(2);
      q.add(3);
      q.offer(4);

      Utility.collection(q);

        System.out.println(q.peek());
        System.out.println(q.element());

        //System.out.println(q.remove());
    }
}
