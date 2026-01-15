import java.lang.*;
public class Patterns
{
    public static void main(String[] args)
{
    for(int i =1; i<=5;i++)
    {
        for(int j=1;j<=i;j++)  // as it prints j acc to i number
        {
            System.out.print("*" + " ");
        }
        System.out.println("");
    }
}
}