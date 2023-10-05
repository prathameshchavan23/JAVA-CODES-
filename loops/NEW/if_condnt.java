public class if_condnt{
    public static void main(String[] args) {
        // If-else 
        int salary=30000;
        // if(salary>7000) {
        //     salary = salary+2000;
        // }
        // else{
        //     salary= salary +1000;
        // }
        if(salary >40000){
            salary += 3000; // += is addition assignment operator which means salary= salary +3000
        } else if (salary > 4000){
            salary += 5000;
        } else {
            salary += 6000;
        }
        System.out.println(salary);
    }
}