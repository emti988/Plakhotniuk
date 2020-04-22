package homework_2.task_1;

public class Task_1 {
    public static void main(String[] args) {
        double day1 = 10;
        double increment = 10;
        int totalDistancePercent = 100;
        int totalDay = 7;
        double totalDistance = 0;
        for (int day = 1; day <= 7; day++) {
            totalDistance += day1 + ((totalDistance / totalDistancePercent) * increment);
        }
        System.out.println("Total distance = " + totalDistance);
    }
}