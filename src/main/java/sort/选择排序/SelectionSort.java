package sort.选择排序;

import java.util.Arrays;

/**
 * @author Lz
 * @date 2021/11/16 9:45
 * @since 1.0.0
 * 简单选择排序
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
