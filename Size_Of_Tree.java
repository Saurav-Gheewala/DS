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
    int SOH(Node root)
    {
        if(root == null)
            return 0;
        else
            return (SOH(root.left) + SOH(root.right)+1);
    }
}
public class Size_Of_Tree 
{
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        Node ptr = root;
        ptr.left = new Node(20);
        ptr.left.left = new Node(40);
        ptr.left.right = new Node(50);
        ptr.right = new Node(30);
        ptr.right.right = new Node(70);
        Process obj = new Process();
        System.out.println("Soze Of Tree Is " + obj.SOH(root));
    }    
}
