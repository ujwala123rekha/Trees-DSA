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
  static void preorder(Node root){
    if(root == null)return;
     System.out.print(root.data);
     preorder(root.left);
    preorder(root.right);
  }
 public static void main(String[] args){
   Node root = new Node(1);
   root.left = new Node(2);
   root.right = new Node(3);
   root.left.left = new Node(4);
   preorder(root);
 }
}
