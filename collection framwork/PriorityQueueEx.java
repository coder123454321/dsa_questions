import java.util.PriorityQueue;
public class PriorityQueueEx{
    static void PriorityQueueExamp(){
        PriorityQueue<Integer>p=new PriorityQueue<>();
        p.add(18);
        p.add(2);
        p.add(3);
        p.add(6);
        p.add(5);
        System.out.println(p.peek());
        System.out.println(p);

    }
    public static void main(String[] args) {
        PriorityQueueExamp();
    }
}
