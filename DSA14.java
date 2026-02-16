import java.util.Stack;
class ArrayStack{
    int[]arr;
    int top;
    ArrayStack(int size){
        arr=new int[size];
        top=0;
    }
    public void push(int element){
        if (top ==arr.length) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[top]=element;
        top++;
    }
    public int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int topElem = arr[top - 1];
        System.out.println(topElem);
        return topElem;
    }
    public void Display(){
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]);

        }
    }
    public void isEmpty(){
        if (top==0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
}


public class DSA14 {
    public static void main(String[] args) {
ArrayStack arrayStack=new ArrayStack(5);
arrayStack.push(11);
arrayStack.push(22);
arrayStack.push(33);
arrayStack.Display();
 arrayStack.pop();
 arrayStack.isEmpty();
 }

    }

