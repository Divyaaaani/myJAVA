// import java.util.*;
 // product of each elem except hte elem at i withouf divison operatir

 
// public class product {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int result[]=product(arr,n);
// // for printing 1,2, 3 ,4
//         // for(int x: result){  
//         //     System.out.println(x+ " ");
//         // }
// // for printing in [1,2,3,4]
// System.out.println(Arrays.toString(result));
//     }

//     static int[] product(int arr[], int n) {
//         int[] res = new int[n];

//         // 1. Prefix products compute karo
//         int leftProduct = 1;
//         for (int i = 0; i < n; i++) {
//             res[i] = leftProduct;
//             leftProduct *= arr[i];
//         }

//         // 2. Suffix products multiply karo
//         int rightProduct = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             res[i] *= rightProduct;
//             rightProduct *= arr[i];
//         }

//         return res; // int[] return ho raha hai
//     }
// }


// // with division operator 
import java.util.*;

// public class product {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int result[]=product(arr,n);
// // for printing in [1,2,3,4]
// System.out.println(Arrays.toString(result));
//     }

//     static int[] product(int arr[], int n) {
//         int[] res = new int[n];
// int p=1;
//         for(int i=0; i<n;i++){
//             p*=arr[i];
//         }
//         for (int i=0;i<n;i++){
//             res[i]=p/arr[i];
//         }

//         return res; // int[] return ho raha hai
//     }
// }

