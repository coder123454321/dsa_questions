public class inserAtStart {
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
       void inserAtStart1(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head=temp;
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
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.inserAtStart1(1);
        ll.inserAtStart1(2);
        ll.inserAtStart1(3);
        ll.display();
    }
}
