package homework_3.task_3;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {1, 7, 5, 10};
        System.out.println("Было " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Стало " + Arrays.toString(array));
    }
}
