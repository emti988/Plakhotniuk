package homework_2.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int cell = 1;
        int totalTime = 24;
        int cellDivision = 2;
        int startOfTime;
        int timeInterval = 3;

        for (startOfTime = 0; startOfTime < totalTime;) {
            startOfTime = startOfTime + timeInterval;
            cell = cell*cellDivision;
            System.out.println("Через " +startOfTime + " ч. - " + cell + " клетки ");
        }
        System.out.println();
        System.out.println("       Успех!");
    }
}