package exec2.task1;

/* Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием
некой научной работы. Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark,
содержащую среднюю оценку. Создать переменную типа Student, которая ссылается на объект типа Aspirant. Создать метод
getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма
100, иначе 80. Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200, иначе
180. Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для
каждого элемента массива.  */



public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }
    @Override
    public double getScholarship() {
        return avgMark == 5? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Инесса", "Кетова", "БУТ1801", 4.8);
        Aspirant aspirant1 = new Aspirant("Григорий", "Цем", "ПГ5с", 5, "Scanning atomic objects");
        /* Создать переменную типа Student, которая ссылается на объект типа Aspirant */
        Student aspirant2 = new Aspirant("Стефан", "Цем", "П102ЮУ", 4.7, "Maintenance of summer cottages");
        Student[] students = {student, aspirant1, aspirant2};
        for(Student s: students) {
            System.out.println(s.getScholarship());

        }
    }
}
