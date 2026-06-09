public class Security {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in){
            System.out.println("enter the number of passwords: ");
            int n= sc.nextInt();
            int count=0;
            for (int i=0;i<n.length;i++){
                for(int j=i;j<n.length;j++){
                    if(n[i]==n[j]){
                        count++;
                    }
                }
            }
            if (count>1){
                 System.out.println("the number of duplicate passwords are: "+count); 
            }
            // System.out.println("the number of duplicate passwords are: "+count);
        }
    }
}
