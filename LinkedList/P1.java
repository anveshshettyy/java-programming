package LinkedList;

class Node{
    int data;
    Node address;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node root;
    void append(int data) {
        Node n = new Node(data);
        if(root == null) {
            root = n;
            return;
        }

        Node x = root;
        while (x.address != null) {
            x = x.address;
        }

        x.address = n;
        return;
    }

    void Displaya() {
        Node x = root;
        System.out.println("Node\t\t\t\tData\t\tNode Address");
        while(x != null) {
            System.out.println(x+ "\t" + x.data +"   \t \t" + x.address);
            x = x.address;
        }
    }
}

public class P1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(10);

        l.Displaya();
    }
}
