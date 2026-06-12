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
public class Main
{
    ArrayList<Integer>ans = new ArrayList<>();
    static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }
    static void addLeftB(Node root,ArrayList<Integer>ans){
        Node curr = root.left;
        while(curr!=null){
            if(isLeaf(curr)==false)ans.add(curr.data);
            if(curr.left!=null)curr = curr.left;
            else curr= curr.right;
        }
    }
    static void addRifgtB(Node root,ArrayList<Integer>ans){
        ArrayList<Integer>temp = new ArrayList<>();
        Node curr = root.right;
        while(curr!=null){
            if(isLeaf(curr)==false)temp.add(curr.data);
            if(curr.right!=null)curr = curr.right;
            else curr= curr.left;
        }
    }
    static void addLeaf(Node root,ArrayList<Integer>ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left !=null)addLeaf(root.left,ans);
        if(root.right!=null)addLeaf(root.right,ans);
    }
    static ArrayList<Integer> PrintBoun(Node node){
        ArrayList<Integer> result = new ArrayList<>();
        if(isLeaf(node)==false)result.add(node.data);
        addLeftB(node,result);
        addLeaf(node,result);
        addRifgtB(node,result);
        return result;
    }
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		System.out.print(PrintBoun(root));
	}
}
