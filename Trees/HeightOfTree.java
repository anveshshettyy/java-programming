package Trees;

class Node{
    Node right;
    Node left;
    int val;
    Node (int val) {
        this.val = val;
    }
}

public class HeightOfTree {
    static int Height(Node root) {
        if(root == null) return 0;
        int heightl = Height(root.left);
        int heightr = Height(root.right);
        int max = Math.max(heightl, heightr);
        return max+1;
    }
    public static void main(String[] args) {
        Node root = null;
        root = new Node(3);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        System.out.println(Height(root));
    }

}
