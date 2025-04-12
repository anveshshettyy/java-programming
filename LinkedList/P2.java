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

    void remove(int i) {
        Node x = root;
        if(i == 0) {
            root = root.address;
        }

        while(i!=1) {
            x = x.address; i--;
        }
        x.address = x.address.address;
    }

    void sort() {
        for(Node i=root; i.address != null; i = i.address ) {
            for(Node j=i.address; j != null; j = j.address) {
                if( i.data > j.data ) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
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

    void bubbleSort() {
        for(Node i=root; i.address != null; i = i.address ) {
            for(Node j=i.address; j.address != null; j = j.address) {
                if( j.data > j.address.data ) {
                    int temp = j.address.data;
                    j.address.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    void reverse() {
        Node prev = null;
        Node curr = root;
        Node next = null;

        while(curr != null) {
            next = curr.address;
            curr.address = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
    }

    void insertionSort() {
        // for(int i=1; i<n; i++) {
        //     int j = i;
        //     while(j>0 && nums[j] < nums[j-1]) {
        //         int temp = nums[j];
        //         nums[j] = nums[j-1];
        //         nums[j-1] = temp;
        //         j--;
        //     }
        // }
        Node prev = null;
        Node curr = root;
        Node next = null;
        for(Node i = root.address ; i.address != null; i = i.address) {
            Node j = i;
            while( j.address !=  root && j.data < j.address.data ) {
                int temp = j.data;
                j.data = j.address.data;
                j.address.data = temp;
                next = curr.address;
                curr.address = prev;
                prev = curr;
                curr = next;
            }
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

public class P2 {
    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.append(1);
        l.append(12);
        l.append(13);
        l.append(14);

        // l.insert(0, 100);
        // l.insert(4, 500);

        l.display();


        // l.remove(3);
        // l.display();

        // l.remove(1);


        // l.sort();
        // l.selectionSort();
        // l.bubbleSort();
        l.reverse();
        l.insertionSort();
        l.display();
        
    }
}
