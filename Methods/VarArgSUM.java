import java.lang.*;
import java.util.*;
class varArgSUM{
      
    static int sum(int ...A)
    {
        int s=0;
        for(int i=0;i<A.length;i++)
            s+=A[i];
        return s;
    }
    
    static double sum(double ...P)
    {
        double price=0;
        for(int i=0;i<P.length;i++)
            price+=P[i];
        
        if(price<500){
            double discount= price*0.10;
            double final_price= price-discount;
            return final_price;
        }
        else if(price>=500 && price<1000) return price*0.15;
        else return price*0.20;
    }
    public static void main(String[] args){
        System.out.println(sum(2,22,33,44,55));
        System.out.println(sum(100.0,200,100)); // 500*0.10 =75.0 
    }
}
