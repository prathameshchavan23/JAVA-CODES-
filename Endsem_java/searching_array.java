package Endsem_java;
import java.util.*;
public class searching_array {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int A[]={3,4,5,6,7};
        int key;
        System.out.println("Enter a key ");
        key=sc.nextInt();

        for(int i=0;i<A.length;i++){
            if(key==A[i]){
                System.out.println("Enter element found at:" +i);
                System.exit(i);
            }
            System.out.println("Not found");
        }
    }
   

    
}
