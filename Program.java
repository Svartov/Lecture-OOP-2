package sample;

public class Program {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Антилопа", "Жёлтый", 86);
        System.out.println(animal1.toString());
        animal1.getVoice();
        animal1.eat();
        animal1.sleep();

        System.out.println();
        Cat cat1 = new Cat("Мыши", "Белый", 5, "Васька");
        System.out.println(cat1.toString());
        cat1.getVoice();
        cat1.eat();
        cat1.sleep();

        System.out.println();
        Dog dog1 = new Dog("Сухой корм", "Чёрный", 55, "Марк");
        System.out.println(dog1.toString());
        dog1.getVoice();
        dog1.eat();
        dog1.sleep();

        System.out.println();
        Veterinarian veterinarian1 = new Veterinarian("Alex");
        veterinarian1.treatment(animal1);
        veterinarian1.treatment(cat1);
        veterinarian1.treatment(dog1);


    }
}