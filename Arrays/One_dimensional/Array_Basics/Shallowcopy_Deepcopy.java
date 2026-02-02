package Arrays.One_dimensional.Array_Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shallowcopy_Deepcopy {
    static void main() {
        int [] arr ={1,2,3,4,5};
        int []x =arr; // shallow copy
         x[0]=100;
        System.out.println(arr[0]);
        int [] y = Arrays.copyOf(arr,arr.length);
        y[1]=200;
        System.out.println(y[1]);
        System.out.println(arr[1]); // deep copy
    }
}
