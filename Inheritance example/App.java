public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car("Toyota", "Corolla", 2022, "Red");

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());;
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());;
    }
}
