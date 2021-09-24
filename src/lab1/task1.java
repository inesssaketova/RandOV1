package lab1;
import java.util.Scanner;

/* Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа. */

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int lastDigit = number%10;
        System.out.print("Последняя цифра числа: " + lastDigit);
        in.close();
    }
}
