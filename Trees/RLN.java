package Trees;


class Node {
    int data;
    Node left, right;
  
    Node(int d) {
      data = d;
    }
}
public class RLN {
    static void postorder(Node root) {
        if(root!=null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    static void rln(Node root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            rln(root.right);
            rln(root.left);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(25);
        postorder(root);
        System.out.println();
        rln(root);
    }
}
