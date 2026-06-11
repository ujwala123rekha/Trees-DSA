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
    static List<Integer> postorder(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)return result;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null)st1.push(root.left);
            if(root.right != null)st2.push(root.right);
            
        }
        while(!st2.isEmpty()){
            result.add(st2.pop().data);
        }
        return result;
    }
	public static void main(String[] args) {
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.left.right = new Node(3);
	    System.out.print(postorder(root));
	}
}
