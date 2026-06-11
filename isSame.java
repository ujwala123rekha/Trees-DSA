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
    public static boolean isSame(Node p,Node q) {
        if(p==null || q == null)return(p==q);
        return (p.data == q.data)&& isSame(p.left,q.left) && isSame(p.right,q.right);
    }
	public static void main(String[] args) {
	    Node p = new Node(1);
	    p.left = new Node(2);
	    p.left.right = new Node(3);
	    
	    Node q = new Node(1);
	    q.left = new Node(2);
	    q.left.right = new Node(3);
	    System.out.print(isSame(p,q));
	}
}
