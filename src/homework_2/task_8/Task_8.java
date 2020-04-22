package homework_2.task_8;

public class Task_8 {
    public static void main(String[] args) {
        int x = 0;
        int y = 100;
        int z = 0;
        for (int i = 0; i <= y; i++) {
            if (i % 2 == 0) {
            z += i;
        } else if (i%2!=0) {
                x+=i;
            }
        }
        System.out.println("четные " +z);
        System.out.println("нечетные " +x);
        System.out.println("общая сумма " + (x+z));
    }
}
