class Matches
{
    public static void  main(String args[])
    {
        String str="Divyani";
        System.out.println(str.matches("."));  //false as it is not a single char
        String str1="@";
        System.out.println(str1.matches("."));

        System.out.println(str.matches("[abc]"));   //abc only
        System.out.println(str.matches("[^p]"));    //except p any alpha
        System.out.println(str.matches("[A-Z][a-z]")); // must have only 2 chars
        System.out.println(str.matches("[a-z][1-9]"));

        //Meta characters 
        // IMPORTANT **works on only single char**
        String m1= "5";
        String m2= "d";
        String m3="$";
        System.out.println(m1.matches("\\d"));  //digit only
        System.out.println(m2.matches("\\D")); // not a digit
        System.out.println(m2.matches("\\w")); // either a digit or a aplha
        System.out.println(m3.matches("\\W")); // neither a digit or alpha= special character

        //Quantifiers
        String q1="akjsflbd";
        String q2="aabbcc";
        System.out.println(q1.matches(".*")); // any chars or digits any no. of times
        System.out.println(q2.matches("[abc]*")); //abc any no. of times
        System.out.println(q1.matches("[abc]+")); //false coz abc must be 1 or more times
        System.out.println(q1.matches("[a-z]*"));
        System.out.println(q1.matches("[abc]?")); //false coz abc must be 0 or 1 times in akjsflbd
        System.out.println(q2.matches("[abc]{6}")); //abc but 6 letters in total.

        String g="diyu1234@gmail.com";
        System.out.println(g.matches(".*@gmail.com"));   //true = front me any digit or letter
        System.out.println(g.matches("\\w*@gmail.com")); //true= alpha or digits any no. of times
       
    }
    
}