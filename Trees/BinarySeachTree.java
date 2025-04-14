package Trees;

class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
    }
}

public class BinarySeachTree {
    public static Node constructBST(Node root, int data) {
        if(root == null) return new Node(data);
        if(data < root.data) {
            root.left = constructBST(root.left, data);
        } else {
            root.right = constructBST(root.right, data);
        }
        return root;
    }
    static void Inorder(Node root) {
        if(root != null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    public static void main(String args[]) {
        Node root = null;
        root =  constructBST(root, 50);
        constructBST(root, 60);
        constructBST(root, 30);
        constructBST(root, 40);
        constructBST(root, 20);
        constructBST(root, 90);
        constructBST(root, 70);

        Inorder(root);
    }
}
