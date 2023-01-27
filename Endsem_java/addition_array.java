package Endsem_java;

public class addition_array {
    public static void main(String[] args) {
        int A[]={3,5,6,8,9,4};
        int sum=0; // as initially it's zero
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println("Sum is  "+sum);
    }
}
