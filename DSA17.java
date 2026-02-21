public class DSA17 {
    static class CircularQueue{
        int size;
        int front,rear;
        int[]arr;
        CircularQueue(int cap){
          arr=new int[cap];
          front=rear=-1;
          size=0;
        }
        void enqueue(int val){
            int length=arr.length;
            arr[(++rear)%length]=val;
            size++;
        }
        void display(){
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);

            }
        }
    }
    public static void main(String[] args) {
CircularQueue c1=new CircularQueue(5);
c1.enqueue(11);
c1.enqueue(22);
c1.enqueue(33);
c1.enqueue(44);
c1.enqueue(55);
c1.display();
    }
}
