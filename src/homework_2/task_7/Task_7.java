package homework_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        int first = 1;
        int step = 1;
        int last = 99;
        int x = 2;
        while (step < last) {
            step = step + x;
            first = first +step;
        }
        System.out.println("Сумма нечетных чисел = " + first);
    }
}
