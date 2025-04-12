package LinkedList;

class DNode {
    int data;
    DNode prev;
    DNode next;
    DNode(int data) {
        this.data = data;
    }
}

class DLinkedList {
    DNode root;
    void append(int data) {
        DNode n = new DNode(data);
        if(root == null) {
            root = n;
            return;
        }
        DNode x =  root;
        while(x.next != null) {
            x = x.next;
        }
        x.next = n;
        n.prev = x;
    }

    void Display() {
        DNode x = root;
        System.out.println("Previous\t\t\tCurrent\t\t\tData\t\t\tNext");
        while(x != null) {
            System.out.println(x.prev+"\t\t\t"+x+"\t\t\t"+x.data+"\t\t\t"+x.next);
            x = x.next;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLinkedList l1 = new DLinkedList();
        // DNode n = new DNode(5);
        l1.append(30);
        l1.append(20);
        l1.append(40);
        l1.append(50);
        l1.append(0);
        l1.Display();
    }
}
