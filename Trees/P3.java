package Trees;

class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
    }
}

public class P3 {
    static Node append(Node root, int data) {
        if(root == null) return new Node(data);
        if(data < root.data) {
            root.left = append(root.left, data);
        } else if(data > root.data) {
            root.right = append(root.right, data);
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
        root = append(root, 50);
        append(root, 60);
        append(root, 70);
        append(root, 80);
        Inorder(root);
    }
}
