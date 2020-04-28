package homework_3.task_7;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {5, 56, 0, 23, 15, 14};
        boolean sort = true;
        System.out.println(Arrays.toString(array));

        while (sort) {
            sort = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    sort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }
}
