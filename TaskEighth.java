import java.util.Scanner;

public class TaskEighth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите первое число: ");
        double numberFist = in.nextDouble();
        System.out.println(" Введите второе число ");
        double numberSecond = in.nextDouble();
        System.out.println(" Сумма квадратов: " + ((numberFist * numberFist) + (numberSecond * numberSecond)));
        System.out.println(" Разность квадратов : " + ((numberFist * numberFist) - (numberSecond * numberSecond)));
        System.out.println("Произведение квадратов: " + ((numberFist * numberFist) * (numberSecond * numberSecond)));
        System.out.println("Частое квадратов: " + ((numberFist * numberFist) / (numberSecond * numberSecond)));

    }
}