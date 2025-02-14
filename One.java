import java.util.Scanner;
// TODO Описание задачи: Напишите программу, которая принимает два числа
//  от пользователя и выводит их сумму и среднее значение.
//  Тест ввода:
//  Введите первое число: 10
//  Введите второе число: 20
//  Ожидаемый вывод:
//  Сумма: 30
//  Среднее значение: 15.0
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print(" Введите второе число: ");
        int b = scanner.nextInt();
        int c = (a + b);
        double d = (a + b)/2;
        System.out.println(" Сумма: " + c);
        System.out.println(" Среднее значение: " + d);


    }
}