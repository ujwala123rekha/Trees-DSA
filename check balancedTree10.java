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
    static int checkBalanced(Node root){
        if(root == null)return 0;
        int lh = checkBalanced(root.left);
        if(lh==-1)return -1;
        int rh = checkBalanced(root.right);
        if(rh == -1)return -1;
        if(Math.abs(lh-rh)>1)return -1;
        return 1+Math.max(lh,rh);
    }
    static boolean isBalanced(Node root){
        return checkBalanced(root)!=-1;
    }
	public static void main(String[] args) {
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.left.left= new Node(4);
	    System.out.print(isBalanced(root));
	}
}
