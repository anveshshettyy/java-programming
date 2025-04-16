package Trees;

class Node{
    Node right;
    Node left;
    int data;
    Node (int val) {
        this.data = val;
    }
}

public class RemoveNode {
    public static Node constructBST(Node root, int data) {
        if(root == null) return new Node(data);
        if(data < root.data) {
            root.left = constructBST(root.left, data);
        } else {
            root.right = constructBST(root.right, data);
        }
        return root;
    }

    static Node removeNode(Node root, int data) {
            if(root == null) return null;

            if(data < root.data) {
                root.left = removeNode(root.left, data);
            } else if (data > root.data) {
                root.right = removeNode(root.right, data);
            } else {
                if(root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                Node elem = root.right;
                while(elem.left != null) {
                    elem = elem.left;
                }
                root.data = elem.data;
                root.right = removeNode(root.right, elem.data);
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
    public static void main(String[] args) {
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
        constructBST(root, 2);
        // constructBST(root, 0);

        Inorder(root);
        System.out.println();

        removeNode(root, 13);

        Inorder(root);

    }
}
