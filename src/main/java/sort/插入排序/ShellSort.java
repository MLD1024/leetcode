package sort.插入排序;

import java.util.Arrays;

/**
 * @author Lz
 * @date 2021/11/16 10:40
 * @since 1.0.0
 * 希尔排序(缩小增量排序)
 */
public class ShellSort {
    public static void sort(int[] arr) {
        int preIndex;
        int current;

        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int j = gap; j < arr.length; j++) {
                current = arr[j];
                preIndex = j - gap;
                while (preIndex > 0 && arr[preIndex] > current) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex = preIndex - gap;
                }
                arr[preIndex + gap] = current;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
