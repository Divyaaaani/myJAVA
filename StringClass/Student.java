class Student
{
    public static void main(String[] args)
    {
        String email= "programmer@gmail.com";
        System.out.println(email.matches("\\w*@gmail.*")); // check wheerther gmail
        System.out.println(email.substring(email.indexOf(".")));  //.com
        System.out.println(email.substring(0,email.indexOf("@")));

   
       
        //or
        int i=email.indexOf("@");
        String username=email.substring(0,i);
        String domain=email.substring(i,email.length());
        System.out.println("domain name = "+domain);
        System.out.println("username = "+username);

        System.out.println(domain.startsWith("@gmail"));

        //to check ano. is binary or not
        int a=1010111;
        String str=String.valueOf(a);   //first convert it into string
        System.out.println(str.matches("[10]+"));  // 1 or more times

        //to check whether hexadecimal no. or not 
        System.out.println("hexadecimal");
        String b= "234fcb";
        System.out.println(b.matches("[0-9 a-f]+")); //dont forget +

        // to check date
        String date="13/04/2005";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    
        //remove special char
        String special="a@b#s$8*c%d";
        System.out.println(special.replaceAll("[@#$%*]*",""));
        //or
        System.out.println(special.replaceAll("[^a-z A-z 0-9]",""));

        //remove extra spaces
        String space="   abc              amb  msure   fk  j";
        System.out.println(space.replaceAll("[\\s]+"," ").toUpperCase());
        //count the no. of words not letters
        String words[]=space.split("\\s");
        System.out.println(space.length() );
    
    
    }
}