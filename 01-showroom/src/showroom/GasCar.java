package showroom;

public class GasCar extends Car {
    private double fuelCapacity;
    
    public GasCar(String brand, String color, double price, double fuelCapacity){
        super(brand, color, price);
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }

    //Override
    public void start(){
        System.out.println("Xe xang");
    }

    //Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Dung tich xang la: " + fuelCapacity);
    }
}
