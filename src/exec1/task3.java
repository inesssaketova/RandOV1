package exec1;
import java.util.Scanner;

/* Ввести целое  число в консоли. Если оно является положительным, то прибавивить к нему 1, в противном случае
* не изменять его. Вывести полученное число. */

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number > 0) {
            number = number + 1;
            System.out.print(number);
        }
        else {
            System.out.println(number);
        }

        in.close();
    }
}