package tim_phan_tu_lon_nhat;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số hàng ma trận :  ");
        int x = input.nextInt();
        System.out.println("Nhập vào số cột ma trận : ");
        int y = input.nextInt();
        float arr[][] = new float[x][y];
        System.out.println("Nhập các phần tử của mảng : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("nhập phần tử arr[%d][%d] = ", i, j);
                arr[i][j] = input.nextFloat();
            }
        }
        float max = arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + "\t\t");
                if (arr[i][j] > max) {
                     max = arr[i][j] ;
                }
            }
            System.out.println();
        }
        System.out.println("Số lớn nhất trong mảng hai chiều là : " + max);

    }
}
