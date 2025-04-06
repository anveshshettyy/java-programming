package LinkedList;


class Node{
    int data;
    Node address;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList3 {
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

    void Insert(int i, int data) {
        Node x = root;
        Node n = new Node(data);
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

    void Delete(int i) {
        Node x = root;
        if(i<0) {
            i = 0;
        }
        while(i!=1) {
            x = x.address;
            i--;
        }
        
    } 
}


public class Starting {
    public static void main(String[] args) {
            LinkedList3 l = new LinkedList3();
            l.append(10);
            l.append(20);
            l.append(30);


    
            l.Displaya();

            l.Insert(2, 1000);
            l.Displaya();
        }
}
