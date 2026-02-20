public class DSA16 {
    public static class Queue1{
        int front,rear;
        int[]arr;
        Queue1(int size){
            arr=new int[size];
            front=0;
            rear=-1;
        }
        public void push(int data){
            if (rear== arr.length-1){
                System.out.println("Queue overflow");
            }arr[++rear]=data;
        }
        public void dequeue(){
            if (front>rear){
                System.out.println("Underflow");
                return ;
            }
            arr[front++]=0;
            return ;
        }
        public void Display(){
            for (int i = 0; i <=rear ; i++) {
                System.out.println(arr[i]);

            }
        }
    }
    public static void main(String[] args) {
Queue1 q1=new Queue1(5);
q1.push(11);
q1.push(22);
q1.push(33);
q1.push(44);
q1.push(55);
q1.dequeue();
q1.dequeue();
q1.Display();
    }
}
