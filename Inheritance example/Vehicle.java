public class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle( String brand, String model, int year){

        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }
}
