// Toggle String
/* 
Problem
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.

Constraints
 where S denotes the length of string S.

Sample Input
abcdE
Sample Output
ABCDe
*/

import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            } else if (Character.isLowerCase(str.charAt(i))) {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
}