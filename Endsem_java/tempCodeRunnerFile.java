package Endsem_java;

public class array_prac {
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int C[]; // creating reference
        C=new int[10]; // initializing object of that size
        B[2]=15; //replacing value 2 of b by 15
        for(int i=0;i<A.length;i++)
        {
            System.out.println(B[i]);
        }


    }
    
}
