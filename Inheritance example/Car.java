public class Car extends Vehicle {

    private String color;

    public Car(String brand, String model, int year, String color){
        super(brand, model, year);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    
}
