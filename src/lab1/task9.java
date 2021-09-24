package lab1;

/* Дан массив целых чисел. Переставить элементы в обратном порядке. Вывести результаты в консоль. */

public class task9 {
    public static void main(String[] args) {
        int[] massiv = new int[14];
        massiv[0] = 15; massiv[1] = 10; massiv[2] = 51; massiv[3] = 6; massiv[4] = 5; massiv[5] = 3; massiv[6] = 10;
        massiv[7] = -34; massiv[8] = 0; massiv[9] = 32; massiv[10] = 56; massiv[11] = 12; massiv[12] = 24; massiv[13] = 52;
        int length_massiv = massiv.length;
        System.out.println("Исходный массив:");
        for (int i = 0; i < length_massiv; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Исходный массив в обратном порядке:");
        for (int i = length_massiv - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
    }
}