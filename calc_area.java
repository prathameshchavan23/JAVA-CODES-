 import java.lang.*;
 import java.util.Scanner;

 class calc_area {
    public static void main(String args[])
    {
        float base , height , area;
        System.out.println("Enter Base & Height ");

        Scanner sc= new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();

        area=base*height/2;
        System.out.println("Area of triangle is "+area);
        
    }
}
