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
        
        while(x != null) {
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

    void Display() {
        Node x = root;
        while(x!=null) {
            System.out.println(x.left+"  "+x.data+"  "+x.right);
            x = x.right;
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(5);
        l1.append(7);
        l1.append(3);
        l1.Display();
    }
}
