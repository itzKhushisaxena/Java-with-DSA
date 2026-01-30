class MyArray{
    private int capacity;
    private int size;
    private int arr[];

    public MyArray(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }
    public void insert(int element,int position){
        if(size==capacity)
        {
            System.out.println("Array is full ! can not insert");
            return;
        }
        else if (position < 0 || position > size) {
            System.out.println("Invalid position!");
            return;
        }
        arr[position]=element;
        size++;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+"");
        }
    }
 }

public class DSA2 {
    public static void main(String[] args) {
    MyArray array=new MyArray(6);
    array.insert(12,0);
    array.insert(34,1);
    array.insert(55,2);
    array.insert(6,3);
    array.insert(24,4);
    array.display();
    }
}
