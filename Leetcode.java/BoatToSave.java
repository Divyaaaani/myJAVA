import java.util.*;
class BoatToSave{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of people:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter limit: ");
        int k= sc.nextInt();
        System.out.println(numRescueBoats(arr,k));
    }
//[1,2,2,3] limit=3
    public static int numRescueBoats(int[] people, int limit){
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int boats=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
                // r--; nhhi krna hai coz bhar toh krege hi boasts++ aur r-- krke next person ko check krenge          
            }
            boats++;
            r--;
        }
        return boats;
    }
}