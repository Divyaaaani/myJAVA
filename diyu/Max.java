import java.lang.*;
import java.util.*;
class Max{
    public static void main(string args[]){
      int n1,n2,n3,n4,n5;
      Scanner sc= new Scanner(System.);
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      n4=sc.nextInt();
      n5=sc.nextInt();

      if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > && n5){
        System.out.println("n1 is greater "+n1);
      }
      else if (n2> n3 && n2 > n4 && n2 > n5){
        System.out.println("n2 is greater "+n2);
      }
      else if (n3>n4 && n3> n5){
        System.out.println("n3 is greater "+n3);
      }
      else if (n4> n5){
        System.out.println("n5 is greater "+ n4);
      }
      else {
        System.out.println("n5  is greater");
      }
    }
}