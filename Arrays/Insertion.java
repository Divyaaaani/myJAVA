import java.util.*;

class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];  // capacity bigger than size
        A[0]=10; A[1]=20; A[2]=30; A[3]=40; A[4]=50;
        int size = 5;

       

        System.out.println("Enter element to insert:");
        int x = sc.nextInt();
         int index = 2;

        // shift elements to the right
        for (int i = size; i > index; i--) {
            A[i] = A[i - 1];
        }

        // insert element
        A[index] = x;
        size++;

        // print array
        for (int i = 0; i < size; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
