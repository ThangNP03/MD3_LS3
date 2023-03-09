package them_phan_tu_vao_mang;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài array : ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Nhập phần tử " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn thêm vào : ");
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++ ) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = sc.nextInt();
        System.out.println(Arrays.toString(newArr));
        //        // them phan tu => nhap => length = arraylength +  1 => them no vao cuoi => in ra
    }

}
