public class getdataAtIdx {
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
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        int getElement(int idx){
            if(idx>0||idx>size()){
                System.out.println("wrong idx");
                return -1;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            // System.out.println(temp.next.data);
            return temp.next.data;
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
       System.out.println(ll.getElement(2));

    }
}
