package sometest;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by zgg on 2019/02/24
 */

public class SortTest {
    // 冒泡排序
    @Test
    public void bubbleSortTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入排列数字，空格分隔，回车结束: ");
        String str = scanner.nextLine();
        System.out.println("输入内容为：" + str);
        scanner.close();
        String[] num = str.split(" ");
        int[] arr = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            arr[i] = Integer.valueOf(num[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("排序结果为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SortTest test = new SortTest();
        test.bubbleSortTest();
    }
}
