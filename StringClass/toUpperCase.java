import java.util.*;
public class toUpperCase{
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");


        char ch=Character.toUpperCase(str.charAt(0)); // convert the first character to uppercase
        sb.append(ch); // append the uppercase character to the StringBuilder

        for (int i=0;i<str.length();i++){
           if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i)); // append the space character
            i++; // move to the next character after the space
            sb.append(Character.toUpperCase(str.charAt(i))); // convert the next character to uppercase and append it
           }
           else{
            sb.append(str.charAt(i));
           }
    }
    return sb.toString();
}
public static void main(String[] args){
    String str="hello world";
    System.out.println(toUpperCase(str));
}
}