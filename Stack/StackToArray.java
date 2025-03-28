package Stack;

import java.util.Stack;

public class StackToArray {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);


        int size = st.size();
        int arr[] = new  int[size];
        for(int i=0; i<size; i++) {
            arr[i] = st.peek();
            st.pop();
        }

        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
