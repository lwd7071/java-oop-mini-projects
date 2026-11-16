package showroom;

public class Car{
    // Encapsulation
    private String brand;
    private String color;
    private double price;
    private static int carCount;

    public Car(){
        carCount += 1;
    }

    public Car(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
        carCount++;
    }


    public String getBrand(){
        return brand;
    } 

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        }
    }

    public static int getCarCount(){
        return carCount;
    }

    public void start(){
        System.out.println("Xe dang chay");
    }

    public void printInfo(){
        System.out.println("Ten xe: " + brand);
        System.out.println("Mau xe: " + color);
        System.out.println("Gia tien: " + price);
    }

    public void printInfo(boolean showPrice){ 
    System.out.println("Ten xe: " + brand);
    System.out.println("Mau xe: " + color);
    if (showPrice) {
        System.out.println("Gia tien: " + price);
    }
}
}