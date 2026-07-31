import java.util.*;
public class infosys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter Target: ");
        int T=sc.nextInt();
        System.out.println(findCycles(arr, N, T));
    }

    static int findCycles(int C[], int N, int T){
        Arrays.sort(C);
        int l=0;
        int r=N-1;
        int cycles=0;
        int totalpower=0;
        while(l<r){

            totalpower+=C[r]-C[l]; // infosys  OA bc i just forgot to write the + 
            // as in this question we have accumulate the power of last and then add.
            cycles++;

            if(totalpower>=T){
                return cycles;
            }
            l++;
            r--;
        }
        return -1;
    }
}
