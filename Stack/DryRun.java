package Stack;

import java.util.Stack;

public class DryRun {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.push(1);

        System.out.println(st.peek());
        System.out.println(st.pop());

        System.out.println(st);
    }
}
