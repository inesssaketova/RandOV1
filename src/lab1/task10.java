package lab1;

/* Дан массив целых чисел. Переместить нули в конец массива. Вывести результаты в консоль. */

public class task10 {
    public static void main(String[] args) {
        int[] massiv = new int[14];
        massiv[0] = 15; massiv[1] = 10; massiv[2] = 0; massiv[3] = -6; massiv[4] = -5; massiv[5] = 3; massiv[6] = 0;
        massiv[7] = -34; massiv[8] = 0; massiv[9] = 32; massiv[10] = 56; massiv[11] = 0; massiv[12] = 24; massiv[13] = 52;
        int length_massiv = massiv.length;

        System.out.println("Исходный массив:");
        for (int i = 0; i < length_massiv; i++) {
            System.out.print(massiv[i] + " ");
        }

        int i = 0;
        for (int j = 0; j < length_massiv; j++) {
            if (massiv[j] != 0)
                massiv[i++] = massiv[j];
        }
        while (i < length_massiv) {
            massiv[i++] = 0;
        }

        System.out.println(" ");
        System.out.println("Исходный массив с нулями в конце:");
        for (int k = 0; k < length_massiv; k++) {
            System.out.print(massiv[k] + " ");
        }
    }
}