/* Question-3
Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

Sample Input 1:

Enter the digits:
65
66
67
68
Sample Output 1:

65-A
66-B
67-C
68-D

Sample Input 2:

Enter the digits:
115
116
101
112
Sample Output 2:

115-s
116-t
101-e
112-p

*/


import java.util.*;
class NoToChar{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        char x=(char)a;
         char y=(char)b;
          char z=(char)c;
           char w=(char)d;

       System.out.println(a+ "-" +x);
       System.out.println(b + "-" +y);
       System.out.println(c + "-" +z);
       System.out.println(d + "-" +w);

    }
}