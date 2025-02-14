import java.util.Scanner;
//TODO Описание задачи: Напишите программу,
//  которая выводит таблицу умножения для числа, введенного пользователем.
//  Тест ввода:
//  Введите число: 7
//  Ожидаемый вывод:
//  Таблица умножения для числа 7:
//  7 x 1 = 7
//  7 x 2 = 14
//  7 x 3 = 21
//  7 x 4 = 28
//  7 x 5 = 35
//  7 x 6 = 42
//  7 x 7 = 49
//  7 x 8 = 56
//  7 x 9 = 63
//  7 x 10 = 70
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}