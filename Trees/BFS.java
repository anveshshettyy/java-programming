package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
    Node1 left;
    Node1 right;
    int val;
    Node1 (int val) {
        this.val = val;
    }
}

public class BFS {
    static void bfs(Node1 root) {
        Queue <Node1> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node1 currNode1 = queue.poll();
            System.out.print(currNode1.val+" ");
            if(currNode1.left != null) {
                queue.add(currNode1.left);
            }
            if(currNode1.right != null) {
                queue.add(currNode1.right);
            }
        }
    }
    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.right = new Node1(3);
        root.left = new Node1(2);
        root.left.left = new Node1(5);
        root.left.right = new Node1(6);
        root.right.left = new Node1(4);
        root.right.right = new Node1(10);
        bfs(root);
    }
}
