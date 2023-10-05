import java.util.*;
public class loops{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         //for loops
        // for(int num=1; num <=5; num+= 1) {
        //     System.out.println(num);
        // }
        // int n = in.nextInt();
        // for(int num=1; num<=n;num++){
        //     System.out.println(num + " ");
        // } 

      //  while loop , 
        int num = 1;
        while (num <=5){
            System.out.println(num);
            num +=1;
        }

        // do while loop

    // do{
    //    System.out.println(num);
    //    num++;
    // } 
    // while(num <=5);


 // Question :- Find the largest of three numbers
    //  int a =  in.nextInt();
    //  int b =  in.nextInt();
    //  int c =  in.nextInt();
      
    //  int max=a;
    //  if(b>max){
    //     max=b;
    //  }
    //  if(c>max){
    //     max=c;
    //  }
    //  System.out.println(max);
      // 2nd approach
    // int max= Math.max(c, Math.max(a,b));
    // System.out.println(max);

    // program to identify upper and lowercase
    // char ch=in.next().trim().charAt(0);
    // if(ch >='a' && ch <='z'){
    //     System.out.println("Lowercase");
    // } else {
    //     System.out.println("Uppercase");
    // }


    }
}