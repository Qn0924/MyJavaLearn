import java.util.ArrayList;
import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        int [] arr={5,4,2,3,1};
        int [] arr1={1,6,7,8,5};
        int[] arr2={6,4,3,2};
        System.out.println(Arrays.equals(arr,arr1));
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr3=Arrays.copyOf(arr2,4);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr1,1));
    }
}
