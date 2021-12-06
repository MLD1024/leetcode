package sort.交换排序;

import java.util.Arrays;

/**
 * @author Lz
 * @date 2021/11/16 9:37
 * @since 1.0.0
 * 冒泡排序
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];        // 元素交换
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
