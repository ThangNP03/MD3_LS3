package gop_mang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GopMang {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4};
            int[] arr2 = {5, 6, 7, 8};
            int[] arr3 = new int[arr1.length + arr2.length];
            int index = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr3[index] = arr1[i];
                index++;
            }
            for (int i = 0; i < arr2.length; i++) {
                arr3[index] = arr2[i];
                index++;
            }
            System.out.println(Arrays.toString(arr3) );
        }
}
