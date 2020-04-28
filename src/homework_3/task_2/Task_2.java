package homework_3.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = {2, 6, 1, 3, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double mean = 0;
        mean = sum / array.length;
        System.out.println("Arithmetic mean value of the array elements: " + mean);
    }
}
