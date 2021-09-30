package exec2.task3;

public class Main {
    public static void main(String[] args) {
        /* Создадим три экземпляра класса Phone */
        Phone phone1 = new Phone("79083524371", "Redmi", 8.3);
        Phone phone2 = new Phone("79083635273", "Xiaomi");
        /* phone2.weight = 9.4; */
        Phone phone3 = new Phone();
        /* phone3.number = "79083273371";
        phone3.model = "Apple";
        phone3.weight = 8.2; */
        /* Выведем на консоль значения их переменных */
        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);


        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);


        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);


        phone1.receiveCall("Папа");
        phone2.receiveCall("Мама", "79084521611");
        phone3.receiveCall("Сестренка", "7902614385");

        phone1.sendMessage("Привет!", "79085629164", "79174525484");
    }
}
