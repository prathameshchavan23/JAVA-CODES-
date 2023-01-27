 import java.lang.*;
 import java.util.Scanner;

 
 class cuboid {
    private static final int Length = 0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length,height,breadth;
        float totalarea,volume;

         System.out.println("Enter Length & Breadth");
         length=sc.nextInt();
         breadth=sc.nextInt();
         height=sc.nextInt();
         totalarea=2*(length*breadth+length*height+breadth*height);
         volume=length*breadth*height;
         System.out.println("Total Area "+totalarea);
         System.out.println("Volume "+volume);


    }
    
}
