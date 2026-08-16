// // package STACK;
// import java.util.*;
// public class StackArrr {
//     int[] arr;
//     int top;
//     // constructor
//     StackArrr(int size) {
//         arr = new int[size];
//         top = -1;
//     }
    
//     void push(int x) {
//         if(top == arr.length - 1) {
//             System.out.println("Stack Overflow");
//             return;
//         }
        
//         top++;
//         arr[top] = x;
//     }
    
//     int pop() {
//         if(top == -1) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }
        
//         return arr[top--];
//     }
    
//     int peek() {
//         if(top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
        
//         return arr[top];
//     }

//     public static void main(String[] args) {
//         // Create a stack of capacity 3
//        ArrayDeque<Integer> s= new ArrayDeque<>();

//         s.push(10);
//         s.push(20);
//         s.push(30);

//         
//         s.push(50); 

//         System.out.println("Top element: " + s.peek()); // 50

//         System.out.println("Popped: " + s.pop()); // 50
//         System.out.println("Popped: " + s.pop()); // 30

//         System.out.println("Top element now: " + s.peek()); // 20
// } 
// }


import java.util.*;
class StackArrr{
int arr[];
int top;
    StackArrr(int size){
        arr= new int[size];
        top=-1;
    }

    void push(int x){
        if(top==arr.length-1){
            System.out.println("Stack overflowwwwwwwwwwwwwwwwwwwwwwww");
            return;
        }
        else 
            top++;
            arr[top]=x;
    }
    
    int pop(){
        if(top==-1){
            System.out.println("Stack is underflowwwwwwwwwww");
                return -1;
        }
        else 
           return  arr[top--];
    }

    int peek(){
        if(top==-1){
            System.out.println("stack is emptyyyyyyyyyyyyy");
            return -1;
        }
        else
            return arr[top];
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    StackArrr s=new StackArrr(5);

    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);

    System.out.println("Top elem is: "+ s.peek()); //50
    System.out.println("popped elem is: "+ s.pop()); //50
    // System.out.println(s.toString());
     System.out.println(" enter the elem to push : ");
     int x=sc.nextInt(); 
      s.push(x);
    //  System.out.println(s.toString()); again cant use htis as it will pritng address
    for (int i = s.top; i >= 0; i--) {
        System.out.print(s.arr[i] + " ");
    }
    System.out.println();
    } 
}