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
    static int checkBalance(Node root){
        if(root == null)return 0;
        int lh = checkBalance(root.left);
        if(lh == -1)return -1;
        int rh = checkBalance(root.right);
        if(rh == -1)return -1;
        if (Math.abs(lh - rh) > 1) {
            return -1; 
        }
        return Math.max(lh, rh) + 1;
        
    }
	public static void main(String[] args) {
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.left.right = new Node(3);
	    System.out.print(checkBalance(root));
	}
}
