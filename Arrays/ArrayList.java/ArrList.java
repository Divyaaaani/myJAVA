import java.util.*;
class ArrList{
    public static void main(String agrs[]){
        ArrayList<Integer> list= new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);    
        list.add(3);

        System.out.println(list);

        //get elements
        int elementat0=list.get(0);
        System.out.println(elementat0);

        //add element at index
        list.add(1 ,99); // this wont delete element at 1 but shift it to right and add 99 at index 1
        System.out.println(list);

        //set element at index
        list.set(1, 88);
        System.out.println(list);

        //remove element at index
        list.remove(3);
        System.out.println(list);

        //list size
        int size=list.size();
        System.out.println(size);

        //LOOPS
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        // sorting
        Collections.sort(list);
        System.out.println(list);

    }

}