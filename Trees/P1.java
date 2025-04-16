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
        
        while(x.right != null && x.left != null) {
            if(n.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        if(n.data < x.data) {
            x.left = n;
        } else {
            x.right = n;
        }
    }

}

public class P1 {
    static void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Node root = new Node(5);
        l1.append(7);
        l1.append(3);
        l1.append(5);
        l1.append(10);
        inorder(root);
    }
}
