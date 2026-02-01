class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

class ListLink {
    Node head;
    Node tell;

    public void InsertAtBeginning(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tell = temp;
        }
        tell.next = temp;
        tell = temp;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

//    public void List () {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.Data + " -> ");
//                temp = temp.next;
//            }
//            System.out.println("null");
//        }
}
class DSA5 {
        public static void main (String[] args){
            ListLink li = new ListLink();
            li.InsertAtBeginning(30);
            li.InsertAtBeginning(20);
            li.InsertAtBeginning(10);
//            System.out.println(li.head.data);
//            System.out.println(li.head.next.data);
//            System.out.println(li.head.next.next.data);
            li.display();
        }
    }


