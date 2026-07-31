public class LinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Add at beginning
    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void addMid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}
        

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.display();

        l1.addFirst(10);
        l1.display();
        l1.addFirst(5);
        l1.display();
        l1.addLast(20);
        l1.display();
        l1.addLast(30);
        l1.display();
        l1.addMid(2,15111);
        l1.display();
    }
}