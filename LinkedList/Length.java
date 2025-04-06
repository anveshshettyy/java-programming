package LinkedList;

class Node{
    int data;
    Node address;
    Node(int data) {
        this.data = data;
    }
}

class LinkedLista {
    Node root;
    int count=0;
    int last = 0;
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

    void Display(){
        Node x = root;
        System.out.println("Node\t\t\t\tData\t\tNode Addess");
        while(x != null) {
            System.out.println(x+ "\t" + x.data +"   \t \t" + x.address);
            last = x.data;
            x = x.address;    
            count++;
        }
        System.out.println("\n");
        System.out.println("the number of nodes is : "+count);
        System.out.println("\n");
        System.out.println("Last Element is: "+last);
    }
}

public class Length {
    public static void main(String[] args) {
        LinkedLista l = new LinkedLista();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        l.append(50);

        l.Display();
    }
}
