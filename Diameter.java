import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Main{
    static int diameter = 0;
    public static int diameterOfBinaryTree(Node root) {
        height(root); 
        return diameter;
    }
    static int height(Node root){
        if(root == null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        diameter = Math.max(diameter,lh+rh);
        
        return Math.max(lh, rh) + 1;
        
    }
	public static void main(String[] args) {
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.left.right = new Node(3);
	    System.out.print(diameterOfBinaryTree(root));
	}
}
