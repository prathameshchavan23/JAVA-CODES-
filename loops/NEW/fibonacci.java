import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; // previous number
        int b = 1; // current index
        int count = 2;
        while (count <=n){
            int temp = b;
            b+= a;
            a = temp; // as temp contains b value
            count++;
}
    System.out.println(b);
    }
}

