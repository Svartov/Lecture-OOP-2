package sample;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }
    public Cat(){
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
        System.out.println("Котик кушает");
    }
    public void sleep() {
        System.out.println("Котик спит");
    }
    public void getVoice() {
        System.out.println("Котик мяу-мяу");
    }

    @Override
    public String toString() {
        return "Котик Имя = " + name + " " + super.toString();
    }
}
