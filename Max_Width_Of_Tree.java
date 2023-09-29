import java.net.SocketTimeoutException;
import java.util.*;

class Solution
{
    int maxWidth(Node root)
    {
        if(root == null)
            return 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int res = 0;
        while(q.isEmpty() == false)
        {
            int count = q.size();
            res = Math.max(res, count);
            for(int i = 0 ; i < count ; i++)
            {
                Node cur = q.poll();
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
        }
        return res;
    }
}
public class Max_Width_Of_Tree 
{
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(50);
        root.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);
        Solution obj = new Solution();
        System.out.println("The Maximum Width Of Tree Is "+ obj.maxWidth(root));
    }   
}
