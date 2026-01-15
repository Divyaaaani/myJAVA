public class Methods
{
    public static void main(String[] args)
    {
        String str= new String(" Divyani Khandait");
        System.out.println(str.length());

        System.out.println(str.toUpperCase()); //directly

        String str1=str.toUpperCase(); //storing it in new variable
        System.out.println(str1);
        
        String str2=str.toLowerCase(); // lower case 
        System.out.println(str2);

        String str3=str.trim();    // removes empty space not middle space
        System.out.println(str3);

        String str4=str.substring(4); //from i=4 till end
        System.out.println(str4);
        String str44=str.substring(4,8); // from i=4 till i<8
        System.out.println(str44);

        String str5=str.replace('a','o');
        System.out.println(str5);

        String a=new String("www.google.com");
        System.out.println(a.startsWith("www")); //starts with
        System.out.println(a.endsWith(".com"));


        System.out.println(a.charAt(9)); 
        for(int i =0;i <a.length();i++)
        System.out.print(a.charAt(i)); //not new line

        System.out.println(a.indexOf("."));
        System.out.println(a.indexOf(".",9));  //i of . after i =9.

        String b=new String("java");
        String c=new String("JAVA");
        System.out.println(b.equals(c));
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println(c.compareTo(b));  //c= JAVa < java =b therefore result is negative and diff betw the ascii codes
        // upper case JAVA is smaller than lower case java
        System.out.println(c.compareToIgnoreCase(b));    //0 =true  check whether equal or not

        System.out.println(a.contains(".com"));  //true
        System.out.println(a.concat(b));
        System.out.println(str+a+b+c); //concatanation
    }
}