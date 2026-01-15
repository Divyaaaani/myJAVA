//concatenation 

class Concatenate
{
    public static void main(String args[])
    {
        int x= 9;
        int y=20;
        char c[]={'h','e','l','l','o'};
        String str= new String(c,0,2);  // from i=0 covers 2 words
        System.out.println(x+y+" sum"); //29
        System.out.println("sum "+x+y);  // sum 920
        System.out.println("sum "+(x+y)); //29 corrected use brackets.
        System.out.println(str); //he
       
    }
}