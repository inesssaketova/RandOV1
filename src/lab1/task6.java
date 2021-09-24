package lab1;
import java.util.Scanner;

/* Ввести целое число в консоли. Вывести его строку описание вида "отрицательное четное число" и т.д. */

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number < 0) {
            if ((number % 10 == 2) || (number % 10 == 4) || (number % 10 == 6) || (number % 10 == 8) || (number % 10 == 0)) {
                System.out.print("Отрицательное четное число");
            }
            else {
                System.out.print("Отрицательное нечетное число");
            }
        }
        else if (number > 0) {
            if ((number % 10 == 2) || (number % 10 == 4) || (number % 10 == 6) || (number % 10 == 8) || (number % 10 == 0)) {
                System.out.print("Положительное четное число");
            }
            else {
                System.out.print("Положительное нечетное число");
            }
        }
        else {
            System.out.print("Нулевое число");
        }

        in.close();
    }
}