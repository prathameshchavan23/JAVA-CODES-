import java.util.Scanner;
public class odd_even {
          public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
             n=sc.nextInt();
             if(n%2==0)
             {
                System.out.println("It is a even number");
            }
            else{
                System.out.println("It is a odd number");
            }
          }
    
}
