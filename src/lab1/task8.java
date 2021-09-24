package lab1;

/* Дан массив целых чисел. Для данного массива вывести на экран: макс. знач, сумму положит эл-в,
* сумму четных отриц. эл-тов, кол-во положит. эл-тов, ср. арифм. отриц. эл-тов */

public class task8 {
    public static void main(String[] args) {
        int[] massiv = new int[14];
        massiv[0] = 1; massiv[1] = -10; massiv[2] = 5; massiv[3] = 6; massiv[4] = 45; massiv[5] = 23; massiv[6] = 45;
        massiv[7] = -34; massiv[8] = 0; massiv[9] = 32; massiv[10] = 56; massiv[11] = -1; massiv[12] = 2; massiv[13] = -2;
        int maxValue = massiv[0];
        for(int i=1; i < massiv.length;i++) {
            if(massiv[i] > maxValue) {
                maxValue = massiv[i];
            }
        }
        System.out.println("Максимальное значение: " + maxValue);
        int summaPlus = 0;
        int countPlus = 0;
        for(int i=1; i < massiv.length;i++) {
            if(massiv[i] > 0) {
                summaPlus = summaPlus + massiv[i];
                countPlus = countPlus +1;
            }
        }
        System.out.println("Сумма положительных элементов: " + summaPlus);
        System.out.println("Количество положительных элементов: " + countPlus);
        int summaMinusN = 0;
        for(int i=1; i < massiv.length;i++) {
            if((massiv[i] < 0) && ((massiv[i] % 10 == 2) || (massiv[i] % 10 == 4) || (massiv[i] % 10 == 6) ||
                    (massiv[i] % 10 == 8) || (massiv[i] % 10 == 0))) {
                summaMinusN = summaMinusN + massiv[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов " + summaMinusN);
        int summaMinus = 0;
        int countMinus = 0;
        for(int i=1; i < massiv.length;i++) {
            if(massiv[i] < 0) {
                summaMinus = summaMinus + massiv[i];
                countMinus = countMinus + 1;
            }
        }
        double srArifmMinus = summaMinus / countMinus;
        System.out.println("Среднее арифметическое отрицательных элементов: " + srArifmMinus);
    }
}
