// import java.lang.*;
// import java.util.*;
// public class Patterns
// {
//     public static void main( String[] args)
//     {
//         for(int i=0;i<=5;i++)
//     {
//         for(int j=0;j<=5;j++)
//         {
//             System.out.print(j+" ");
//         }
//         System.out.println(" ");
//     }
//     }
// }

// import java.lang.*;
// import java.util.*;
// public class Patterns
// {
//     public static void main( String[] args)
//     {
//         for(int i=0;i<=5;i++)
//     {
//         for(int j=0;j<=5;j++)
//         {
//             System.out.print(i+" ");
//         }
//         System.out.println(" ");
//     }
//     }
// }


// import java.lang.*;
// import java.util.*;
// public class Patterns
// {
//     public static void main( String[] args)
//     {
//         for(int i=1;i<=5;i++)
//     {
//         for(int j=1;j<=5;j++)
//         {
//             System.out.print(i+j +" ");
//         }
//         System.out.println(" ");
//     }
//     }
// }


// import java.lang.*;
// import java.util.*;
// public class Patterns
// {
//     public static void main(String[] args)
// {
//     int count=0;
//     for(int i =1; i<5;i++)
//     {
//         for(int j=0;j<5;j++)
//         {
//             count++;
//             System.out.format("%2d " ,count); // 2 decimal place %02d for 01..02..03 display
//         }
//         System.out.println("");
//     }
// }
// }

// import java.lang.*;
// public class Patterns
// {
//     public static void main(String[] args)
// {
//     for(int i =1; i<=5;i++)
//     {
//         for(int j=1;j<=i;j++)  // as it prints j acc to i number
//         {
//             System.out.print(j); // j ki jgh pr *
//         }
//         System.out.println("");
//     }
// }
// }

// import java.lang.*;
// public class Patterns
// {
//     public static void main(String[] args)
// {
//     int count=0;
//     for(int i =1; i<=5;i++)
//     {
//         for(int j=1;j<=i;j++)  // as it prints j acc to i number
//         {
//             count++;
//             System.out.print(count + " ");
//         }
//         System.out.println("");
//     }
// }
// }

// import java.lang.*;
// public class Patterns
// {
//     public static void main(String[] args)
// {
//     for(int i =1; i<=5;i++)
//     {
//         for(int j=1;j<=i;j++)  // as it prints j acc to i number
//         {
//             System.out.print("*" + " ");
//         }
//         System.out.println("");
//     }
// }
// }

// import java.lang.*;
// public class Patterns
// {
//     public static void main(String[] args)
//     {
//         for(int i =1; i<=5; i++) // i from 5 to 1
//         {
//             for(int j=1; j<=5-i+1; j++) // j from i to 1
//             {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.lang.*;
// public class Patterns
// {
//     public static void main(String[] args)
//     {
       
//         for(int i =1; i<=5; i++) //main for loop goes till 5 rows
//         {
//             //space
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }

//             //star
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             //space
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println("");
//         }
           
    
// }

// }

import java.lang.*;
public class Patterns
{
    public static void main(String[] args)
    {
       
        for(int i =1; i<=5; i++) //main for loop goes till 5 rows
        {
            //space
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=2*5-(2*i-1);j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
           
    
}

}