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
    static List<Integer> IterativeInOrder(Node root){
        List<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr =root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.data);
            curr = curr.right;
        }
        return res;
    }
    
	public static void main(String[] args) {
	    Node root = new Node(12);
	    root.left = new Node(32);
	    root.right = new Node(56);
	    root.left.right = new Node(89);
	    System.out.print(IterativeInOrder(root));
	}
}
