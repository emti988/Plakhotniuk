package homework_2.task_5;

public class Task_5 {
    public static void main(String[] args) {
        int inch;
        double cm;
        double cm_in_inch = 2.54;
        int totalInch = 20;
        int counter = 0;
        for (inch = 1; inch <= totalInch; inch++){
            cm = inch * cm_in_inch;
            System.out.println(inch + " дюйму соответствует " + cm + " см.");
            counter++;
            if (counter==5) {
                System.out.println();
                counter=0;
            }
        }
    }
}
