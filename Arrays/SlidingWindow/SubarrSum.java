import java.util.*;
class SubarrSum {
    public static void main(String[] args){
        int arr[]={1,2,5,5,5};
        int n=arr.length;
        int k=15;
        int maxlen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
                System.out.println();
            }
        }
        System.out.println("Maximum length of subarray with sum <= "+k+" is: "+maxlen);
    }
}