import java.util.*;
public class StackLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        static class Stack{
            static Node head=null;

            public static boolean isEmpty(){
                return head==null;
            }

            //push
            public static void push (int data){
                Node newNode =new Node(data);
                if(isEmpty()){
                    head= newNode;
                }
                else{
                    newNode.next=head;
                    head=newNode;
                }
            }

            //pop
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top=head.data;// store elem to pop
                head= head.next;   
                return top;  
            }

            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;            
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Stack s= new Stack(); // class ka naam hi 

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(4);

         System.out.println("enter the popped elem: " + s.pop());

        // You just can't do this and expect the elements:
        // System.out.println(s); --will just print a address
        // because s is your custom Stack object.
        // op1: use this
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());
    }

}


