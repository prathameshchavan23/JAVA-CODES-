import java.util.*;

public class multi_dimens_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // [] 1d arrays [] [] 2d arrays
        // int [] [] arr = new int [] []; // entering no.of rows is mandatory and both
        // columns indicate rows and columns

        // int[] [] arr = {
        // {1,2,3} //0th index
        // {4,5} //1st Index
        // {6,7,8,9} //2nd Index
        // };

        int[][] arr = new int[3][2];
        System.out.println(arr.length);// arr.length gives no.of rows

        //for (int row = 0; row < arr.length; row++) {
            // arr[row].length means every array at that row will be length of that arrays
            // means row=column
            // for (int col = 0; col < arr[row].length; col++) {
            // arr[row][col] = sc.nextInt();
            // }
            // System.out.println();

            //we can also write this as 
            // for (int row = 0; row<arr.length;row++){
            //     System.out.println(Arrays.toString(arr[row]));

            for(int[] a:arr ){
                System.out.println(Arrays.toString(a));
            }
            }
        }
    

