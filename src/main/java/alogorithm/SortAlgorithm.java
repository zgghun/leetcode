package alogorithm;

import org.junit.Test;

/**
 * Created by zgg on 2018/6/13
 **/

public class SortAlgorithm {
    private static int[] array = {3, 4, 1, 5, 2};

    // 冒泡排序
    @Test
    public void bubbleSort(){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    array = swap(array, j + 1, j);
                }
            }
        }
        arrayPrint(array);
    }

    public static int[] swap(int[] array, int i, int j) {
        int[] result = new int[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        int temp = result[i];
        result[i] = result[j];
        result[j] = temp;
        return result;
    }

    public static void arrayPrint(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(" ,");
            }
        }
        System.out.println("}");
    }

}
