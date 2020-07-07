package API.serialization;

public class Car {

    private String model;
    private String color;
    private int year;
    private int price;
    private String condition;

    public Car(String model, String color, int year){
        this.model=model; // this keyword means usong current class variables
        this.color=color;
        this.year=year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
