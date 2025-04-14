package Trees;

class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node root;
    void append(int data) {
        Node n = new Node(data);
        Node x = root;
        if(root == null) {
            root = n;
            return;
        }
        
        
    }

    void Display() {
        Node x = root;
        while(x!=null) {
            System.out.println(x.left+"  "+x.data+"  "+x.right);
            x = x.right;
        }
    }
}

public class P2 {
    static void Inorder(Node root) {
        if(root != null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }

    static void Preorder(Node root) {
        if(root != null) {
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }

    static void PostOrder(Node root) {
        if(root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        Node x = new Node(1);
        Node root = x;

        x.left = new Node(2);
        x.right = new Node(3);
        x.right.right = new Node(4);
        x.left.left = new Node(5);
        x.left.right = new Node(6);
        x.right.left = new Node(7);
        System.out.print("Inorder: ");
        Inorder(root);
        System.out.println();
        System.out.print("Preorder: ");
        Preorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        PostOrder(root);
    }
}
