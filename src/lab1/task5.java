package lab1;
import java.util.Scanner;

/* Ввести три целых числа в консоли. Вывести на экран наименьшее из них. */

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number1 = in.nextInt();
        System.out.print("Введите число: ");
        int number2 = in.nextInt();
        System.out.print("Введите число: ");
        int number3 = in.nextInt();
        if (number1 < number2) {
            if (number1 < number3) {
                System.out.print(number1);
            }
        }
        if (number2 < number1) {
            if (number2 < number3) {
                System.out.print(number2);
            }
        }
        if (number3 < number1) {
            if (number3 < number2) {
                System.out.print(number3);
            }
        }
        if ((number1 == number2) && (number2 == number3)) {
            System.out.println("Числа равны.");
            System.out.print(number1);
        }


        in.close();
    }
}