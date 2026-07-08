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
    static List<Integer> preorder(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)return result;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            result.add(root.data);
            if(root.right!=null)st.push(root.right);
            if(root.left != null)st.push(root.left);
            
        }
        return result;
    }
	public static void main(String[] args) {
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.left.right = new Node(3);
	    System.out.print(preorder(root));
	}
}
