public class ObjPassing 
{
    static void  change(int X[],int index,int value) //obj A[] is passed as reference so the actual obj is modified
    {
        X[index]=value;
    }
    static void change2(int x[],int value)
    {
        x[]=value;
    }
    public static void main(String[] args)
    {
        int A[]={1,2,3,4,5,6,7,8};
        change(A,2,999);
        
        for(int x:A)
        {
            System.out.println(x);
        }
        int x=10;
        change2(x,20);
        System.out.println("vaule of primitive: "+x);
    }
}