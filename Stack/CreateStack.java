package Stack;

public class CreateStack {
    static int i=0;
    static int size = 5;
    static int arr[] = new int[size];
    
    static void isFull() {
        if(i >= size) 
            System.out.println("Stack is Full");
    }

    static void isEmpty() {
        if(i == 0) 
            System.out.println("Stack is Empty");
    }

    static void Peek(){
        int index = (size - i);
        if(i==0) 
            isEmpty();
        else 
            System.out.println("Peek: "+ arr[index] );
    }

    static void Push(int num) {
        if(i >= size) 
            isFull();
        else {
            System.out.println("Pushed Element is: "+num);
            arr[i] = num;
            i++;
        }
    }

    static void Pop() {
        if(i==0)
            isEmpty();
        else {
            System.out.println("Popped Element is: "+arr[size - i]);
            arr[size - i] = 0;
            i--;
        }
    }
    
    static void Print() {
        System.out.print("Stack Elements are: ");
        // for(int i:arr) 
        //     System.out.print(i+" ");

        for(int i=arr.length-1; i>=0; i--)  {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Push(1);
        Push(2);
        Push(3);
        Push(4);
        Push(5);

        Print();

        Push(5);

        Peek();
        
        Print();

        Pop();
        Pop();
        Pop();
        Pop();

        Print();

        Peek();

        Pop();

        Print();
    }
}
