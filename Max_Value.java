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
    int Maximum(Node root)
    {
        if(root == null)
            return Integer.MIN_VALUE;
        else
            return (Math.max(root.data, Math.max(Maximum(root.left), Maximum(root.right) )));
    }
}
public class Max_Value 
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
        System.out.println("The Maximum Value Of Tree " + obj.Maximum(root));
    }    
}
