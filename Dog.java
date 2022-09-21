package sample;

public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }
    public Dog(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Переопределите методы  getVoice(), eat(), sleep().

    public void eat() {
        System.out.println("Пёсик кушает");
    }
    public void sleep() {
        System.out.println("Пёсик спит");
    }
    public void getVoice() {
        System.out.println("Пёсик гав-гав");
    }

    @Override
    public String toString() {
        return "Пёсик Имя = " + name + " " + super.toString();
    }
}