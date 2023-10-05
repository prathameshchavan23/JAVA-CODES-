public class func_4 {
    public static void main(String[] args) {
        fun(67);
        fun("Prathamesh");
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
// for function overloading both the datatypes of arguments should be diff or refer
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
