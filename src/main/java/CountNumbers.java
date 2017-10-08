import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CountNumbers {

    static void countNumbers(int[][] arr) {
        int n = arr.length;
        for (int index =0; index < n ; index++){
             int low = arr[index][0];
             int high = arr[index][1];
             int totalNumbersBetweenRange = high- low+1;
             int totalTens = totalNumbersBetweenRange/10;
            System.out.println(high-low);
        }
    }

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int arr_rows = 0;
        int arr_cols = 0;
        arr_rows = Integer.parseInt(in.nextLine().trim());
        arr_cols = Integer.parseInt(in.nextLine().trim());

        int[][] arr = new int[arr_rows][arr_cols];
        for(int arr_i = 0; arr_i < arr_rows; arr_i++) {
            for(int arr_j = 0; arr_j < arr_cols; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        countNumbers(arr);

    }
}


