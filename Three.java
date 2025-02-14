import java.util.Scanner;
// TODO Факториал числа
//  Описание задачи: Напишите программу,
//  которая вычисляет факториал числа, введенного пользователем.
//  Тест ввода:
//  Введите число: 5
//  Ожидаемый вывод:
//  Факториал числа 5 равен 120.
public class Three {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print(" Введите число: ");
        int number = scaner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(" Факториал числа " + number + " равен " + result);

    }
}
