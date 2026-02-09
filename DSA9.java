class Node1{
    int data;
    Node1 prev;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
    void displayData(){
    }
}

public class DSA9 {
  public static void main() {
Node1 a=new Node1(4);
Node1 b=new Node1(6);
Node1 c=new Node1(3);
Node1 d=new Node1(7);
a.next=b;
b.prev=a;

b.next=c;
c.prev=b;

c.next=d;
d.prev=c;
      System.out.println(a.data);
      System.out.println(a.next.data);
      System.out.println(a.next.next.data);
      System.out.println(a.next.next.next.data);
      System.out.println("---------------------");
      System.out.println(d.data);
      System.out.println(d.prev.data);
      System.out.println(d.prev.prev.data);
      System.out.println(d.prev.prev.prev.data);

  }
}

