import java.util.LinkedList;
import java.util.Queue;

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
    void BFS(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false)
        {
            Node ptr = q.poll();
            System.out.print(ptr.data + " ");
            if(ptr.left != null)
                q.add(ptr.left);
            if(ptr.right != null)
                q.add(ptr.right);
        } 
    }
}
class Leval_Order_Traversal_BFS
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
        System.out.print("The Leval Order Traversal Is: ");
        obj.BFS(root);
        System.out.println("");
    }
}