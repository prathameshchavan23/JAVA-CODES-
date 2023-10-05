import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();
         
        // switch (fruit){
        //     case "Mango":
        //     System.out.println("King of fruits");
        //     break;
        //     case "Grapes":
        //     System.out.println("A sweet red fruit");
        //     break;
        //     case "Orange":
        //     System.out.println("Round fruit");
        //     break;
        //     default:
        //     System.out.println("Please enter a valid fruit");
        
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thurs");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sunday");
           
        }
            
            
            
            
        }
    }
    
