import java.util.Stack;

public class stackExapl {
    static void StackExample(){
        Stack<String>st=new Stack<>();
        st.push("Apple");
        st.push("Banana");
        st.push("Cherry");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
    public static void main(String[] args) {
        StackExample();
    }
}
