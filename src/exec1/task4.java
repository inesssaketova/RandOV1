package exec1;
import java.util.Scanner;

/* Ввести целое  число в консоли. Если оно является положительным, то прибавивить к нему 1, если трицательным,
 * то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число. */

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number > 0) {
            number = number + 1;
            System.out.print(number);
        }
        else if (number < 0){
            number = number - 2;
            System.out.println(number);
        }
        else {
            number = 10;
            System.out.println(number);
        }

        in.close();
    }
}