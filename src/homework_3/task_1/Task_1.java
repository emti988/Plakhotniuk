package homework_3.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number:");
            array[i] = scan.nextInt();
        }
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + max + "; min = " + min);
    }
}

