public class TaskSeven {
    //TODO Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
    public static void main(String[] args) {
        int a = 5;
        if (a > 0) {
            System.out.println("Число А = " + a + " - положительное");
        }
        if (a < 0) {
            System.out.println("Число А = " + a + " - отрицательное");
        }
        if (a == 0) {
            System.out.println("Число А = " + a);
        }
    }
}