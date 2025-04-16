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
    
    public static boolean SearchBST(Node root, int target) {
        if(root == null) return false;
        if(root.data == target) return true;
        boolean left=false, right=false;
        if(target < root.data) {
            left = SearchBST(root.left, target);
        } else {
            right = SearchBST(root.right, target);
        }
        return (left || right);
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
        root =  constructBST(root, 8);
        constructBST(root, 3);
        constructBST(root, 10);
        constructBST(root, 1);
        constructBST(root, 6);
        constructBST(root, 14);
        constructBST(root, 4);
        constructBST(root, 7);
        constructBST(root, 13);
        constructBST(root, 15);

        // Inorder(root);

        System.out.println(SearchBST(root, 20));
    }
}
