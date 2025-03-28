package Stack;

import java.util.Stack;

public class ArrayToStack {
    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};

        Stack <Integer> st = new Stack<>();

        System.out.println("Intitial Size: "+st.size());

        for(int i:nums) 
            st.push(i);
        

        System.out.println("After: "+st.size());


        System.out.println("Peek: "+st.peek());
        System.out.println(st);
        if(st.size() != 0) {
            System.out.println("is Full");
        }

        for(int i:nums) 
            st.pop();
        
        System.out.println(st);

        System.out.println(st.size());

        if(st.size() == 0) {
            System.out.println("is Empty");
        }
    }
}
