package Trees;

public class SwapNodes {
    static void Swap(Node n1, Node n2){
        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);

        System.out.println(root.data+" "+root.right.data);
        Swap(root, root.right);
        System.out.println(root.data+" "+root.right.data);
    }
}
