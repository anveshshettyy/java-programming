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
public class BST {
    public static void main(String args[]) {
        Node n = new Node(50);
        n.left = new Node(20);
        n.left = new Node(20);
        n.left = new Node(20);
        n.left = new Node(20);
    }
}
