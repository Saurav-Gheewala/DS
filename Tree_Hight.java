class Node{
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
    // int max(int a , int b)
    // {
    //     if(a>b)
    //         return a;
    //     else
    //         return b;
    // }
    int hight(Node root)
    {
        if(root == null)
            return 0;
        else
            return Math.max(hight(root.left), hight(root.right))+1;
    }
}
public class Tree_Hight 
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
    System.out.println("Hight Of Tree Is " + obj.hight(root));
 }   
}
