package exec1;
import java.util.Scanner;

/* Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа. */

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        int length = String.valueOf(number).length();
        if (length == 3) {
            int lastDigit = number%10;
            number = number/10;
            int secondDigit = number%10;
            number = number/10;
            int firstDigit = number%10;
            int summa = firstDigit + secondDigit + lastDigit;
            System.out.print("Сумма цифр этого числа: " + summa);
        }
        else {
            System.out.println("Вы ввели не трехзначное число!");
        }

        in.close();
    }
}