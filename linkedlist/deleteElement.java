public class deleteElement {
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
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
        }
        void deleteElement1(int idx){
            Node temp=head;
            if(idx==0){
                head=head.next;
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
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
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.inserAtEnd1(1);
        ll.inserAtEnd1(2);
        ll.inserAtEnd1(3);
        ll.inserAtEnd1(4);
        ll.deleteElement1(0);
        ll.display();
    }
}
