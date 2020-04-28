package homework_3.task_5;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        int[] array_2 = new int[array.length];
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            array_2[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(array_2));

    }
}
