import java.util.Scanner;
//TODO Описание задачи: Напишите программу, которая проверяет,
// является ли введенное пользователем число четным или нечетным.
// Тест ввода:
// Введите число: 7
// Ожидаемый вывод:
// Число 7 - нечетное.
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(" Число " + number + " - четное");
        } else {
            System.out.println(" Число " + number + " - нечетное ");
        }
    }
}
