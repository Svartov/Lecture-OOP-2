package sample;

public class Animal {
   private String ration; // (чем питается животное)
   private String color; // (какого оно цвета)
   private int weight; // (вес)

    public Animal(String ration, String color, int weight){
        super();
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }
    public Animal(){
        super();
    }

    public String getRation(){
        return ration;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }


    public void setRation(String ration){
        this.ration = ration;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Ням ням, как вкусно.");
    }
    public void sleep(){
        System.out.println("Я сплю не мешайте, Ххх....");
    }
    public void getVoice(){
        System.out.println("Животные гав-мяу");
    }

    @Override
    public String toString(){
        return "Рацион = " + ration + " Цвет = " + color + " Вес = " + weight + "кг";
    }

}
