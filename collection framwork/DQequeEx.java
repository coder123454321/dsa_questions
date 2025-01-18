import java.util.ArrayDeque;
import java.util.Deque;

public class DQequeEx {
    static void DequeEx(){
        Deque<Integer>d=new ArrayDeque<>();
        d.addFirst(1);
        d.addFirst(2);;
        d.addFirst(3);
        System.out.println(d.pollFirst());
        System.out.println(d);
    }
    public static void main(String[] args) {
        DequeEx();
    }
}
