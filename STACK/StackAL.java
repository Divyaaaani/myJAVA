import java.util.*;
public class StackAL {
    static class Stack{

         ArrayList<Integer> list= new ArrayList<>();
        
        public  boolean isEmpty(){
            return list.size()==0;
        }

       
        // implement other major functions

        //push
        public  void push(int x){
            list.add(x);
        }
        public int pop(){
           int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            return list.get(list.size()-1); 
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Stack s= new Stack(); // class ka naam hi 

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

         System.out.println("enter the popped elem: " + s.pop());

        // You just can't do this and expect the elements:
        // System.out.println(s); --will just print a address
        // because s is your custom Stack object.
        // op1: use this
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        // op2: use this
        System.out.println(s.list);
        System.out.println(s.isEmpty());
    }

}
