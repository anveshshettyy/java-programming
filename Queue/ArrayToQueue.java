package Queue;

public class ArrayToQueue {
    static int arr[] = new int[5];
    static int size = arr.length;
    static int i=0, j = 0, k = 0, first = 0, last = size-1;
    static void Display() {
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }
    static void Enqueue(int num) {
        if(isFull()) {
            System.out.println("Queue is Full");
        } else {
            arr[i] = num; i++;
        }
    } 

    static void DequeueAddFirst(int num) {
        if(isFull()) {
            System.out.println("Queue is Full");
        } else {
            arr[first] = num;k++;
        }
    }
    static void DequeeAddLast(int num) {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            arr[last] = num;
        }
    }
    static void poll() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Head Element is: "+arr[j]);
            arr[j] = 0;
            j++;
        }
    }
    static boolean isFull() {
        if(i == size) {
            return true;
        } 
        return false;
    }

    static boolean isEmpty() {
        if(i == 0 && k == 0) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        // Enqueue(2);
        // Enqueue(3);
        // Enqueue(4);
        // Enqueue(5);
        // Enqueue(6);

        Display();

        DequeueAddFirst(1);

        DequeeAddLast(2);
        DequeeAddLast(3);

        Enqueue(4);

        DequeueAddFirst(10);

        Enqueue(44);
        Enqueue(55);
        Enqueue(66);



        Display();


        poll();


        // Dequeue();
        // Dequeue();
        
    }
}
