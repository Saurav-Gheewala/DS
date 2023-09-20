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
    void printFromKthDistence(Node root , int k)
    {
        if(root == null)
            return;
        if(k == 0)
            System.out.print(root.data + " ");
        else
        {
            printFromKthDistence(root.left, k-1);
            printFromKthDistence(root.right, k-1);
        }    
    }
}
public class Print_From_K_Distence 
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
        ptr.right.right.right = new Node(80);    
        Process obj = new Process();
        int k = 2;
        System.out.print("Printing "+k+"nd Line: ");
        obj.printFromKthDistence(root, k);
    }    
}   
