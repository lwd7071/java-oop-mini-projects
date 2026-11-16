package showroom;
// Inheritance
public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String color, double price, int batteryCapacity){
        super(brand, color, price);
        this.batteryCapacity = batteryCapacity;
    }
    
    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int baterryCapacity){
        this.batteryCapacity = baterryCapacity;
    }


    // Override
    public void start(){
        System.out.println("Xe dien");
    }   


    // Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Dung luong pin la: " + batteryCapacity);
    }
}
