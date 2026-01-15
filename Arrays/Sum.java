class Sum
{
    public static void main(String args[])
    {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        // for(int i=0;i<A.length;i++)
        // {
        //     sum=sum+A[i];  
        // }

        //or using for each elem
        for (int x: A){
            sum= sum+ x;
        } }

}