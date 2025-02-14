import java.util.Scanner;
// TODOО писание задачи: Напишите программу, которая выводит числа от N до 1 в обратном порядке.
//  Тест ввода:
//  Введите N: 3
//  Ожидаемый вывод:
//  3
//  2
//  1
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите N: ");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--)
        {
            System.out.println(i);

        }
    }
}
