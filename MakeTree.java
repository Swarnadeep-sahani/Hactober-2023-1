class node{
    int data;
    node left;
    node right;
    node(int d){
       data=d;
    }
}
class MakeTree {
    
   public static void printNode(node root)
   {
       node ptr=root;
       while (ptr!=null) {
        System.out.print(ptr.data+" ");
        printNode(ptr.right);
           ptr=ptr.left; 
       }
   }  
    public static void main(String[] args) {
       
    node root=new node(1);          //          1
    root.left=new node(2);          //        /   \ 
    root.right=new node(3);         //       2     3
    root.left.left=new node(4);     //      / \   / \
    root.left.right=new node(5);    //     4   5  6  7
    root.right.left=new node(6);
    root.right.right=new node(7);
    printNode(root);
}
}
