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
        Stack<Node>st = new Stack<>();
        Node curr = root;
        Node temp;
      while(curr != null || !st.isEmpty()){
        if(curr!=null ){
            st.push(curr);
            curr = curr.left;
        }
        else{
            temp = st.peek().right;
            if(temp == null){
                temp = st.pop();
                result.add(temp.data);
                while(!st.isEmpty() && temp ==st.peek().right){
                    temp = st.peek();
                    st.pop();
                    result.add(temp.data);
                }
            }
            else{
                curr = temp;
            }
        }
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
