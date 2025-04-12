package LinkedList;

class Node {
    int data;
    Node address;
    Node (int data) {
        this.data = data;
    }
}
class LinkedList2 {
    Node root;
    void append(int val) {
        Node n = new Node(val);
        if(root == null) {
            root = n;
            root.address = root;
            return;
        }
        if(root.address == root) {
            root.address = n;
            n.address = root;
            return;
        }

        Node x = root;
        while(x.address != root) {
            x = x.address;
        }
        x.address = n;
        n.address = root;
    }

    void display22() {
        Node x = root;
        
        System.out.println("Node\t\t\t\tData\t\tNode Address");
        do {
            System.out.println(x + "\t" + x.data + "   \t \t" + x.address);
            x = x.address;
        } while (x != root);
        System.out.println();
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        LinkedList2 l = new LinkedList2();
        l.append(1);
        l.append(12);
        l.append(13);
        l.append(14);

        l.display22();

        // l.display22();
    }
}
