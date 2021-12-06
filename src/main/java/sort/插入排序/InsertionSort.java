package sort.插入排序;

import java.util.Arrays;

/**
 * @author Lz
 * @date 2021/11/16 10:27
 * @since 1.0.0
 */
public class InsertionSort {

    public static void sort(int[] arr, int left, int right) {

        int preIndex;
        int current;

        for (int i = 1; i < arr.length; i++) {

            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }



    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 7};
        sort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}
