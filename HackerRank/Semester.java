import java.util.*;
public class Semester {
   public static int maxMarks(int[] marks, int n){
       int max= marks[0];
       for(int i=1; i<marks.length; i++){
           if(marks[i]>max){
               max= marks[i];
           }
       }
       return max;
       }
   } 

   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
     System.out.println("enter the number of semesters: ");
     int n= sc.nextInt();
     int marks[]= new int[n];
     System.out.println("enter the marks for each semester: ");
     for(int i=0; i<n; i++){
         marks[i]= sc.nextInt();
         System.out.println("marks for semester " + (i + 1) + ": " + marks[i]);
          ;
         for(int i=0;i<sub.length;i++){
                 int max= maxMarks(marks,n);
     System.out.println("the maximum marks are: "+max); 
         }
     }


   }
}
