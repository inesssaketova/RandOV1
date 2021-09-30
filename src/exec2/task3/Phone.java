package exec2.task3;
/* Создадим класс Phone, который содержит переменные number, model и weight */
public class Phone {
    String number;
    String model;
    double weight;
    /* Добавим конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса
     - number, model и weight */
    Phone(String n, String m, double w) {
        /* Вызовем из конструктора с тремя параметрами конструктор с двумя */
        this(n,m);
        weight = w;
    }
    /* Добавим конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model */
    Phone(String n, String m) {
        number = n;
        model = m;
    }
    /* Добавим конструктор без параметров */
    Phone() {
    }
    /* Добавим в класс Phone метод receiveCall, который имеет один параметр – имя звонящего.
    Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
    Вызовем эти методы для каждого из объектов. */
    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    /* Добавим перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона
    звонящего. Вызовем этот метод */
    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером " + number);
    }
    /* Создадим метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
    которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов */
    void sendMessage(String message, String... numbers) {
        System.out.println("Отправляем сообщение " + message + " на номера: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    String getNumber() {
        return number;
    }
}


