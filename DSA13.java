import java.util.Stack;

public class DSA13 {
    public static Stack reverseStack(Stack s1) {
        Stack s2 = new Stack();
        System.out.println(s1.size());
        for (int i = 0; i < 6; i++) {
            s2.add(s1.pop());
        }
        System.out.println(s2);
        Stack s3 = new Stack();
        for (int i = 0; i < 6; i++) {
            s3.add(s2.pop());
        }
        System.out.println(s3);
        for (int i = 0; i < 6; i++) {
            s1.add(s3.pop());

            return s1;
        }
        return s2;
    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.add(11);
        s1.add(22);
        s1.add(33);
        s1.add(44);
        s1.add(55);
        s1.add(66);
        System.out.println("before:"+s1);
        reverseStack(s1);
        System.out.println("After:"+s1);

    }
}
