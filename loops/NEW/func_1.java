import java.util.*;
public class func_1 {

    public static void main(String[] args) {
      //  sum(); // calling function

      //or

      int ans = sum2();
       System.out.println(ans);
    }
      // anything u are using in static it has to be a static as we have givem sum() as static we have to cretae it's object as static
        // static void sum(){
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter number 1");
        //     int num1 = sc.nextInt();
        //     System.out.println("Enter number 2");
        //     int num2 = sc.nextInt();
        //     int sum = num1 +num2;
        //     System.out.println("The sum of num1 + num 2 is :" + sum);
        // }

        static int sum2(){ // int means the function will return the value in int type
       Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2");
            int num2 = sc.nextInt();
            int sum = num1 +num2;
            System.out.println("The sum of num1 + num 2 is :" + sum);
            return sum; // It is used to exit from a method, with or without a value, without using void we can use direct return with it's function name

        }
        

}

