class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
class Process
{
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    void preorder(Node root)
    {
       if(root != null)
        {
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    void postorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
class Tree_Travers
{
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        Node ptr = root;
        ptr.left = new Node(20);
        ptr.right = new Node(30);
        ptr = ptr.right;
        ptr.left = new Node(40);
        ptr.right = new Node(50);
        Process obj = new Process();
        System.out.print("Preorder: ");
        obj.preorder(root);
        System.out.println(" ");
        System.out.print("Inorder: ");
        obj.inorder(root);
        System.out.println("");
        System.out.print("Postorder: ");
        obj.postorder(root);
        System.out.println("");
    }
}