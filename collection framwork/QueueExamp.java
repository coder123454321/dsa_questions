import java.util.LinkedList;
import java.util.Queue;
public class QueueExamp {
    static  void QueueExamp1(){
        Queue<Integer>q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q); 
    }
    public static void main(String[] args) {
        QueueExamp1();
    }
}

