import java.util.ArrayList;
public class ArrayListEx {
    public static void ArrayListExample() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println("List: " + l);
        System.out.println(l.get(1));
        l.set(1,50);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    public static void main(String[] args) {
        ArrayListExample();
    }
}
