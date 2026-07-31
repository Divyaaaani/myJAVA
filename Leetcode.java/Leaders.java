import java.util.*;
class Leaders{
    static ArrayList<Integer>leaders (int arr[]){
        ArrayList<Integer> list= new ArrayList<>();
        int max=arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(arr[i]);
            }
        // Reverse the list to get original order
        } 
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(leaders(arr));
    }
}