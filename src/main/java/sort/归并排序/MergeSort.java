package sort.归并排序;

import java.util.Arrays;

/**
 * @author Lz
 * @date 2021/11/16 10:59
 * @since 1.0.0
 */
public class MergeSort {

    public static void sort(int[] arr, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            mergeSort(arr, left, right);
        }

    }

    public static void mergeSort(int[] arr, int left, int right) {
        int preIndex;
        int current;
        for (int i = left + 1; i < right; i++) {
            current = arr[i];
            preIndex = i - 1;
            while (preIndex > 0 && arr[preIndex] > current) {
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
