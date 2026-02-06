class node1{
    int data;
    node1 next;
    node1(int data){
        this.data=data;
    }
}
class LinkedList{
    node1 head=null;
    node1 tail=null;
    void InsertAtIndex(int val){
        node1 temp=new node1(val);
        if (head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=head;
        }
    }
void displayfunc(){
        node1 temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

}
}
public class DSA7 {
   public static void main(String[] args) {
node1 a= new node1(67);
node1 b= new node1(54);
node1 c= new node1(22);
node1 d= new node1(17);
a.next =b;
b.next=c;
c.next=d;
       node1 temp=a;
        for (int i = 1; i <=4 ; i++) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

 }

    }
