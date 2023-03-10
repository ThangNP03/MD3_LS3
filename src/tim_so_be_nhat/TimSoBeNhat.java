package tim_so_be_nhat;

import java.util.Arrays;
import java.util.Scanner;

public class TimSoBeNhat {
    public static void main(String[] args) {
        int arrayLength;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài array : ");
        arrayLength = sc.nextInt();
        arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Nhập phần tử " + i);
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Số bé nhất trong mảng là : " + min);

    }
}

