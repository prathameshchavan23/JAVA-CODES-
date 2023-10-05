
import java.util.Scanner;
import java.util.*;
public class array_2nd {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=34;
        arr[1]=45;
        arr[2]=23;
        arr[3]=89;
        arr[4]=78;
      //  System.out.println(arr[3]);


        // input using for loops
        // arr.length :- size of array , many times u don't know the size of array
        for(int i=0; i<arr.length; i++){
          arr[i]= in.nextInt();
        }
// best way to print using toString method 
System.out.println(Arrays.toString(arr));
        
        
        
        // enhanced for loop/ for each loop  :- to directly get the item
        // for(int num: arr){  for every element ,print the element
           // System.out.println(num + " "); /Here num represents elemnts of arrys 
        }

    }
