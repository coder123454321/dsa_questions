

public class Implimentation{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    //add operations--------
    //addFirst
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //addlast
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;
    }
    public void PrintList(){
        Node currNode=head;
        if(head==null){
            System.out.print("list is empty");
        }
        while(currNode.next!=null){
            System.out.print(currNode.data+ " -> ");
            currNode=currNode.next;

        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        Implimentation implimentation = new Implimentation();
        implimentation.addfirst(10);
        implimentation.addfirst(20);
        implimentation.addfirst(30);
        implimentation.addfirst(40);
        implimentation.PrintList();
    }
}