package Trees;

class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
    }
}
public class FindPath {
    static boolean FindPathh(Node root, int target, int sum) {
        if(root == null) return false;
        sum += root.data;
        if(sum == target && root.right == null && root.left == null) return true;
        boolean left = FindPathh(root.left, target, sum);
        boolean right = FindPathh(root.right, target, sum);
        return (left || right);
    }
    public static void main(String[] args) {
        Node root = null;
        root = new Node(5);        
        root.left = new Node(4);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right = new Node(8);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        System.out.println(FindPathh(root, 18, 0));
    }
}
