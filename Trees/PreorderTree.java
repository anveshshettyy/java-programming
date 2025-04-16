package Trees;

import java.util.* ;

class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
    }
}


public class PreorderTree {
    public static Node constructBST(Node root, int data) {
        if(root == null) return new Node(data);
        if(data < root.data) {
            root.left = constructBST(root.left, data);
        } else {
            root.right = constructBST(root.right, data);
        }
        return root;
    }

    static void preorder(Node root) {
        Stack <Node> s = new Stack<>();
        Node node;
        s.push(root);
        while(!s.isEmpty()) {
            node = s.pop();
            System.out.print(node.data+" ");
            if(node.right != null) {
                s.push(node.right);
            }
            if(node.left != null) {
                s.push(node.left);
            } 
        }
    }

    static void inorder(Node root) {
        Stack <Node> s = new Stack<>();
        Node node = root;
        while( node != null || !s.isEmpty()) {
            while(node!=null) {
                s.push(node);
                node = node.left;
            }

            node = s.pop();
            System.out.print(node.data+" ");

            node = node.right;
        }
    } 
    public static void main(String[] args) {
        Node root = null;
        root =  constructBST(root, 50);
        constructBST(root, 60);
        constructBST(root, 30);
        constructBST(root, 40);
        constructBST(root, 20);
        constructBST(root, 90);
        constructBST(root, 70);

        System.out.print("Prerder: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(root);
    }
}
