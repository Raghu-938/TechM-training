import java.util.*;
public class stackk {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        for(int e:st) System.out.println(e);
        st.pop();
        for(int e:st) System.out.println(e);
        System.out.println(st.peek());
        System.out.println(st);
        while(!st.empty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
