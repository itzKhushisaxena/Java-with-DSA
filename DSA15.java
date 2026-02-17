import java.util.Stack;

public class DSA15 {
    public static void main(String[] args) {
String str1="Khushi";
        Stack<Character>s1=new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
        s1.push(str1.charAt(i));
        }
        String rev="";
        for (int i = 0; i < str1.length(); i++) {
        rev+=s1.pop();
        }
        System.out.println(rev);
    }

    }
