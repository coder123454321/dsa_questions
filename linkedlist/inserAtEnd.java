public class inserAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static  class linkedList{
        Node head=null;
        Node tail=null;
        void inserAtEnd1(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.inserAtEnd1(1);
        ll.inserAtEnd1(2);
        ll.inserAtEnd1(3);
        ll.inserAtEnd1(4);
        ll.display();
       System.out.println(ll.size());
        
    }
}
