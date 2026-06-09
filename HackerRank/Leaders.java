import java.util.*;

public class Leaders {
//[23,2,4,512,43,44]
    static void leaders(int arr[], int n) {

        for(int i = 0; i < n; i++) {

            boolean leader = true;

            for(int j = i + 1; j < n; j++) {

                if(arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if(leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        leaders(arr, n);
    }
}