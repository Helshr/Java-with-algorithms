package SelectionSort;

import java.util.Arrays;

/**
 * @Author: helonghuan
 * @Date: 2018/11/16 4:51 PM
 */
public class SelectionSort {

    private SelectionSort() {};

    private static int findMinum(int[] arr, int index) {
        int minIndex = index;
        int minValue = arr[index];
        for (int i = index; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, findMinum(arr, i));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 98, 23, 100};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

