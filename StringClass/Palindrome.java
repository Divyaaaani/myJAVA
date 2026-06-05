import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        boolean flag=true;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                // flag=false;
                // break;
                return false;
            }
        }
        // return flag;
        return true;
    }
    public static void main(String[] args){
        String str="madaim";
        System.out.println(isPalindrome(str));
    }
}
