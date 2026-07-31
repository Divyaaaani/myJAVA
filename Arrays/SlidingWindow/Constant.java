import java.util.*;
class Constant {
    public static void main(String[] args){
        int arr[]={-1,2,3,3,4,5,-1};
        int k=3;
        int n=arr.length;
        int sum=0;

        //step 1: calculate sum of first k elements
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int maxSum=sum;
        int l=0;
        int r=k-1;
        //step 2: calculate sum of remaining elements : SLIDE THE WINDOW
        while(r < n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxSum=Math.max(maxSum,sum);

        }
        System.out.println(maxSum);
    }
}