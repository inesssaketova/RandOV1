package exec2.task2;

/* Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food,
location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль
"Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных. Создайте класс Ветеринар,
в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location
пришедшего на прием животного. В методе main создайте массив типа Animal, в который запишите животных всех
имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
 */


public class Main {
    public static void main(String[] args) {
        Veterinar veterinar = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Каша", "Частный дом");
        animals[1] = new Cat("Сырое мясо", "Квартира");
        animals[2] = new Horse("Сено", "Деревня");

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
    }
}