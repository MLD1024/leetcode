package sort.交换排序;

import java.util.Arrays;

/**
 * @author Lz
 * @date 2021/11/16 9:54
 * @since 1.0.0
 */
public class QuickSort {

    public static void sort(int[] arr, int left, int right) {

        if (left < right) {
            int partition = partition(arr, left, right);
            sort(arr, left, partition - 1);
            sort(arr, partition + 1, right);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (right > left && pivot <= arr[right]) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && pivot >= arr[left]) {
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = pivot;
        return left;
    }

    public int p(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (right > left && nums[right] >= pivot) {
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            nums[right] = nums[left];

        }
        nums[left] = pivot;
        return left;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};

        sort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}