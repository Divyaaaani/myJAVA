import java.util.*;

public class Main {

    static String[] sortStrings(String arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        String arr[] = { "mango", "apple", "banana", "orange" };

        String sorted[] = sortStrings(arr);

        for (String str : sorted) {
            System.out.println(str);
        }
    }
}