public class preeOrderImplimentation{
    public static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;
        public static Node preeOrderImplimentation1(int nodes[]){
            idx++;
            if(idx>=nodes.length||nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=preeOrderImplimentation1(nodes);
            newNode.right=preeOrderImplimentation1(nodes);
            return newNode;
        }
    }
    public static void PreeOrderTraversal(Node root){

        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreeOrderTraversal(root.left);
        PreeOrderTraversal(root.right);
        
    }
    public static void InOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.preeOrderImplimentation1(nodes);
        // System.out.println(root.data);
        PreeOrderTraversal(root);
        System.out.println("");
        System.out.print("Inorder traversal");
        System.out.println("");
        InOrderTraversal(root);
    }
}