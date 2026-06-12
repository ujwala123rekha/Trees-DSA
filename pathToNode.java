import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    static boolean rootToNode(Node root, int target,
                              ArrayList<Integer> path) {

       if(root == null)return false;
       path.add(root.data);
       if(root.data==target)return true;
       if(rootToNode(root.left,target,path) || rootToNode(root.right,target,path))
       return true;
       path.remove(path.size()-1);
       return false;
       
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> path = new ArrayList<>();

        if (rootToNode(root, 5, path)) {

            for (int node : path) {
                System.out.print(node + " ");
            }

        } else {
            System.out.println("Node not found");
        }
    }
}
