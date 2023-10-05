import java.util.Arrays;

public class func_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,67, 10};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0]=99;
        nums[1]=63; // If you make a change to object via this ref variable will be changed.
    }
}
