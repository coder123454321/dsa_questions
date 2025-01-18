public class insertAtIndex {
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
           int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
        void insertAtIndex1(int idx,int data){
            Node newNode1=new Node(data);
            Node temp=head;
            if(idx==0){
                inserAtStart1(data);
                return;
            }
            if(idx==size()){
                inserAtEnd1(data);
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;

            }
            newNode1.next=temp.next;
            temp.next=newNode1;

        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.inserAtEnd1(1);
        ll.inserAtEnd1(2);
        ll.inserAtEnd1(3);
        ll.inserAtEnd1(4);
        ll.insertAtIndex1(0, 7);
        ll.insertAtIndex1(5, 9);
        ll.display();
        System.out.println("null");
        System.out.println(ll.tail.data);
    }
}
