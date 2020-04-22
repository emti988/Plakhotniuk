package homework_2.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int firstVariable = 1;
        int lastVariable = 256;
        int step = 2;
        int sum_total = 0;
        while (firstVariable <=lastVariable) {
            sum_total +=firstVariable;
            firstVariable *= step;
        }
        System.out.println( + sum_total);
    }
}
