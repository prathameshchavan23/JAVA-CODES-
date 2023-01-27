import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter temp in c:");
        float tempV=in.nextFloat();
        float tempF=(tempV* 9f/5f)+32;
        System.out.println(tempF);
    }
    
}
