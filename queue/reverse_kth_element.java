import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_kth_element{
    public static void main(String[] args) {
        Queue <Integer> q1=new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        int k=2;
        Stack<Integer>s1=new Stack<>();
        for(int i=0;i<k;i++){
            s1.push(q1.remove());
        }
        while (!s1.isEmpty()) {
            q1.add(s1.pop());
        }
        for(int i=0;i<5-k;i++){
            q1.add(q1.remove());
        }
        System.out.println(q1);
       
    }
}