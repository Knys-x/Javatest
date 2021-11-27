package exercise;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入五位需要进行排序的数，排序结果为从小到大显示");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        change(array);
    }

    public static void change(int array[]) {
        for(int n=1;n<5;n++) {
            for (int m = 0; m < array.length - n; m++) {
                if (array[m] > array[m + 1]) {
                    int temp = array[m];
                    array[m] = array[m + 1];
                    array[m + 1] = temp;
                } else {
                    array[m] = array[m];
                    array[m + 1] = array[m + 1];
                }
            }
        }
        for (int n = 0; n < array.length; n++) {
            if (n != array.length - 1) {
                System.out.print(array[n]);
                System.out.print(",");
            }else{
                System.out.print(array[n]);
            }

        }
    }
}
