class node2{
    int data;
    node2 next;
    node2(int data){
        this.data=data;
    }
}
class Linked {
    node2 head = null;
    node2 tail = null;
    void insertAtEnd(int val){
        node2 temp=new node2(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void InsertAtHead(int val) {
        node2 temp = new node2(val);
        if (head == null) ;
        head = tail = temp;
        InsertAtHead(val);
        return;
    }

    void displayFunc() {
        node2 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class DSA8 {
    public static void main() {

        Linked l1 = new Linked();
        l1.InsertAtHead(66);
        l1.InsertAtHead(45);
        l1.displayFunc();
        System.out.println("The head of array: "+l1.head.data);
        System.out.println("The head of array: " + l1.head.data);
    }
}
