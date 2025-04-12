package LinkedList;
class Node {
    int data;
    Node address;
    Node (int data) {
        this.data = data;
    }
}

class LinkedList1 {
    int lastNode = 0;
    Node root;
    void append(int val) {
        Node n = new Node(val);
        if(root == null) {
            root = n;
            return;
        }

        Node x = root;
        while(x.address != null) {
            x = x.address;
        }
        x.address = n;
        lastNode = n.data;
        return;
    }

    void insert(int i, int val) {
        Node x = root;
        Node n = new Node(val);

        if(i == 0) {
            n.address = x;
            root = n;
            return;
        }

        while(i != 1) {
            x = x.address;
            i--;
        }
        n.address = x.address;
        x.address = n;
        return;
    }

    void selectionSort() {
        for(Node i=root; i != null; i = i.address) {
            Node min = i;
            for(Node j=i.address; j != null; j = j.address) {
                if(j.data < min.data) {
                    min = j;
                }
            }
            int temp = i.data;
            i.data = min.data;
            min.data = temp;
        }
    }

    void display() {
        int length = 0;
        Node x = root;
        
        System.out.println("Node\t\t\t\tData\t\tNode Address");
        while(x != null) {
            System.out.println(x+ "\t" + x.data +"   \t \t" + x.address);
            x = x.address;
            length++;
        }
        System.out.println();
        x = root;
        
        System.out.println("New Node: "+x);
        System.out.println("Lenght is: "+length);
        System.out.println("Last Node is: "+lastNode);
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.append(100);
        l.append(12);
        l.append(130);
        l.append(1);

        l.display();

        l.selectionSort();
        l.display();
    }
}
