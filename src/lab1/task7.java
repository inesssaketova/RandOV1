package lab1;
import java.util.Scanner;

/* Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости
* от кода города. */

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int kod = in.nextInt();
        int Moscow = 905; int Rostov = 194; int Krasnodar = 491; int Kirov = 800;
        if (kod == Moscow) {
            double summa = 4.15*10;
            System.out.println("Москва. Стоимость разговора: " + summa);
        }
        else if (kod == Rostov) {
            double summa = 1.98*10;
            System.out.println("Ростов. Стоимость разговора: " + summa);
        }
        else if (kod == Krasnodar) {
            double summa = 2.69*10;
            System.out.println("Краснодар. Стоимость разговора: " + summa);
        }
        else if (kod == Kirov) {
            double summa = 5.00*10;
            System.out.println("Киров. Стоимость разговора: " + summa);
        }
        else {
            System.out.println("Такого города нет.");
        }
        in.close();
    }
}