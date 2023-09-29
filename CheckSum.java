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
    boolean checksum(Node root)
    {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        int sum = 0;
        if(root.left != null)
            sum += root.left.data;
        if(root.right != null)
            sum += root.right.data;
        return (sum == root.data) && (checksum(root.left)) && (checksum(root.right));
    }
}
//Program To Check Whether The Sum Of Two Child Node Is Equal To It's Parents Node Or Not.
class CheckSum
{
    public static void main(String[] args) 
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(9);
        root.right.right = new Node(3);
        Solution obj = new Solution();
        if(obj.checksum(root))
            System.out.println("The Sum Of Child Node Is Equal To It's Parents Node.");
        else
            System.out.println("The Sum Of Child Node Is Not Equal To It's Parents Node.");
    }
}