import java.util.*;
class SubarrBrute {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // Process subarray from index i to j
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}

//code for printng all subarrays of an array using brute force approach. The outer two loops iterate through all possible starting and ending indices of the subarrays, while the innermost loop prints the elements of the current subarray.