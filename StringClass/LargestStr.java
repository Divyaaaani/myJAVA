import java.util.*;
   public class LargestStr {
    public static String isLargest(String fruits[]){
        String Largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(Largest.compareTo(fruits[i])<0){
                Largest=fruits[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args){
        String fruits[]={"apple","banana","mango","grapes"};
        System.out.println(isLargest(fruits));
    }
}
