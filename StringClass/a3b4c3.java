import java.util.*;
public class a3b4c3 {
    public static String StringCompress(String str){
        String newStr=" ";

        for (int i=0;i<str.length();i++){

            // int count=1; wrong we need to use Integer class to convert int to string
            int count=1; 
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                // this will only count repitions
                count++;
                i++;
            }
            newStr= newStr+ str.charAt(i); // for adding the character to the new string

            if(count>1){
                newStr+= count; //  toString method to convert Integer to String
            }
            }
        return newStr;
        }
 

        //same using string builder
        public static String StringBuild(String str){
            StringBuilder sb=new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                int count = 1;

                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                    count++;
                    i++;
                }

                sb.append(str.charAt(i)); // while loop ke baad hi add kr lena h na

                if (count > 1) { // while loop ke baad hi add kr lena h na
                    sb.append(count);
                }
            }
           
            return sb.toString();
        }


    public static void main(String[] args){
        String str="aaabbbbccc";    
        System.out.println(StringCompress(str));
        System.out.println(StringBuild(str));
    }

}  