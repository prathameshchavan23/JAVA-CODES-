import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=14 && age<=55){
            System.out.println("U are young");
        }
        else{
            System.out.println("U are not young");
        }
    }
}
