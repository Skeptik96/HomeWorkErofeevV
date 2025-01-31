import java.util.Scanner;

public class TaskSecond {
    //TODO Дана сторона квадрата a. Найти его площадь S=a2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите длинну стороны квадрата : ");
        int firstNumber = sc.nextInt();
        System.out.println(" Площадь квадрата : " + firstNumber * firstNumber);

    }
}