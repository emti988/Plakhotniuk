package homework_3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {3, 6, 1, 43, 13, 2,  7, 10};
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        int[] evenArray = new int[even];
        int indexFirstEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[indexFirstEven] = array[i];
                indexFirstEven++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(evenArray));
    }
}
