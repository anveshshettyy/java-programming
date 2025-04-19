package Trees;

import java.util.ArrayList;

class Node{
    Node right; 
    Node left;
    int data;
    Node (int data) {
        this.data = data;
    }
}

public class Heap {
    ArrayList <Integer> heap;
    Heap() {
        heap = new ArrayList<>();
        heap.add(null);
    }

    static int parent(int i) {
        return i/2;
    }

    static int leftChild(int i) {
        return 2*i;
    }

    static int rightChild(int i) {
        return (2*i)+1;
    }

    static void heapify_up_max(ArrayList <Integer> heap, int i) {
        while(i>1 && heap.get(i) > heap.get(parent(i))) {
            int temp = heap.get(parent(i));
            heap.set((parent(i)), heap.get(i));
            heap.set(i, temp);
            i = parent(i);
        }
    }

    static void heapify_up_down(ArrayList <Integer> heap, int i) {
        while(i>1 && heap.get(i) < heap.get(parent(i))) {
            int temp = heap.get(parent(i));
            heap.set(parent(i), heap.get(i));
            heap.set(i, temp);
            i = parent(i);
        }
    }

    static void heapify_down_min(ArrayList <Integer> heap, int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if(left < heap.size() && heap.get(left) < heap.get(i)) {
            smallest = left;
        }
        if(right < heap.size() && heap.get(right) < heap.get(i)) {
            smallest = right;
        }

        if(smallest != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(smallest));
            heap.set(smallest, temp);
            heapify_down_min(heap, smallest);
        }

    }

    static void insert(ArrayList<Integer> heap, int data) {
        heap.add(data);
        heapify_up_max(heap, data);
    }

    static void delete(Ar)

    static 
    public static void main(String[] args) {
        Heap heap = new Heap();
        insert(null, 0);
    }
}
