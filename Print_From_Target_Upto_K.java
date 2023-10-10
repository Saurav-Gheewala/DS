import java.util.ArrayList;

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
class Solution
{
    ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        findDistToParent(root, target, k, ans);
        ans.sort(null);
        return ans;
    }
    void atDistNode(Node root , int k, ArrayList<Integer> ans)
    {
        if(root == null || k<0){
            return;
        }
        if(k == 0){
            ans.add(root.data);
        }
        atDistNode(root.left, k - 1, ans);
        atDistNode(root.right, k - 1, ans);
    }
    int findDistToParent(Node root ,int target, int k, ArrayList<Integer> ans)
    {
        if(root == null){
            return -1;
        }
        if(root.data == target)
        {
            atDistNode(root, k, ans);
            return 0;
        }
        int distLeft = findDistToParent(root.left, target, k, ans);
        if(distLeft != -1)
        {
            if(distLeft + 1 == k)
                ans.add(root.data);
            else    
                atDistNode(root.right, k-distLeft-2, ans);
        return distLeft+1;
        }
        int distRight = findDistToParent(root.right, target, k, ans);
        if(distRight != -1)
        {
            if(distRight + 1 == k)
                ans.add(root.data);
            else
                atDistNode(root.left, k-distRight-2, ans);
        return distRight+1;
        }
    return -1;
    }
}
public class Print_From_Target_Upto_K 
{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(80);
        root.left.left.right = new Node(90);

        /*              10
                        /\
                      20  30
                     / \  / \             
                    40 50 60 70
                   / \
                  80 90 
        */
        Solution obj = new Solution();
        ArrayList<Integer> res = new ArrayList<Integer>();  
        res = obj.KDistanceNodes(root, 20, 2);
        for(int i = 0 ; i < res.size() ; i++)
        {
            System.out.print(res.get(i)+ " ");
        }
        System.out.println("");
    }   
}