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
    void method_1(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false)
        {
            int cnt = q.size();
            for(int i = 0 ; i < cnt ; i++)
            {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
            System.out.println("");
        }
    }    
    void method_2(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size() > 1)
        {
            Node cur = q.poll();
            if(cur == null)
            {
                System.out.println("");
                q.add(null);
                continue;
            }
            System.out.print(cur.data + " ");
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
    }
}
public class LOT_NewLine 
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
        System.out.println("");
        System.out.println("Leval Order Traversal By Method 1");
        obj.method_1(root);
        System.out.println("");
        System.out.println("Leval Order Traversal By Method 2");
        obj.method_2(root);
    }

}
