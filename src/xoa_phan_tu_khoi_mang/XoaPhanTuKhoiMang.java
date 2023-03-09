package xoa_phan_tu_khoi_mang;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        //tạo mảng ban đầu
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] newArr = new int [array.length - 1];
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào phần tử muốn xóa : ");
        int X;
        X = input.nextInt();
        int k = 0 ;
        for (int i = 0; i < array.length; i++) {
            if(i == X){
               continue;
            }
           newArr[k++] = array[i];
        }
        System.out.println("Mảng ban đầu " + Arrays.toString(array));
        System.out.println("Mảng sau khi xóa phần tử " + Arrays.toString(newArr));
    }




}
