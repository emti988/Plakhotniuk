package homework_3.task_4;

public class Task_4 {
    public static void main(String[] args) {
        int[][] tab = new int[9][9];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (i + 1) * (j + 1);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
