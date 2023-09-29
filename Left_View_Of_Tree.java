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
    int max_ptr = 0;
    void left_view(Node root, int ptr)
    {
        if(root == null)
            return ;
        if(max_ptr < ptr)
        {
            System.out.print(root.data + " ");
            max_ptr = ptr;
        }
        left_view(root.left, ptr + 1);
        left_view(root.right, ptr + 1);
    }
    void PrintLeftView(Node root)
    {
        left_view(root, 1);
    }
}
class Left_View_Of_Tree
{
    public static void main(String[] args) 
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        Solution obj = new Solution();
        System.out.print("Left View Of Tree: ");
        obj.PrintLeftView(root);
        System.out.println("");
    }
}