package sample;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        super();
        this.name = name;
    }

    public Veterinarian() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        System.out.println("Доктор " + getName() + " Лечит " + animal.toString());
    }

    @Override
    public String toString() {
        return "Ветеренар = " + name;
    }

}
