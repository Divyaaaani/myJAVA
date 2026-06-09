import java.util.*;
class equals {
    public static boolean equals(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    public static void main (String args[]){ 
        String s1 = "Hello";
        String s2 = "Hellllllllo";
        System.out.println(equals(s1, s2)); // returns a boolean value
    }}