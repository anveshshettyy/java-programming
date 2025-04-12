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

    void sort() {
        DNode x = root;
        for(DNode i = x.next; i != null; i = i.next) {
            for(DNode j = x.next; j!=null; j = j.next) {
                while(j.data < j.prev.data) {
                    int temp = j.data;
                    j.data = j.prev.data;
                    j.prev.data = temp;
                }
            }
        }
    }

    void Display() {
        DNode x = root;
        while(x != null) {
            System.out.print(x.data+" ");
            x = x.next;
        }
        System.out.println();

    }
}

public class SortDLL {
    public static void main(String[] args) {
        DLinkedList l1 = new DLinkedList();
        // DNode n = new DNode(5);
        l1.append(30);
        l1.append(20);
        l1.append(40);
        l1.append(50);
        l1.append(0);
        l1.Display();
        l1.sort();
        l1.Display();
    }
}
