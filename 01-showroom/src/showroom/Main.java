package showroom;

public class Main {
    public static void main(String[] args){
        ElectricCar car1 = new ElectricCar("Vinfast", "Black", 50000000, 1000);
        GasCar car2 = new GasCar("Toyota", "Red", 70000000, 100);
        Car car3 = new Car("BMW", "White", 80000000);

        Car[] cars = {car1, car2, car3};



        for (int i = 0; i < cars.length; i++){
            System.out.println("Thong tin cua xe so " + (i+1));
            cars[i].printInfo();
            cars[i].start();
            System.out.println("=============================");
        }

        System.out.println("Tong so xe la: " + Car.getCarCount());
        

        // Test overload
        for (int i = 0; i < cars.length; i++){
            System.out.println("Thong in cua xe khong co gia");
            System.out.println("Thong tin cua xe so " + (i+1));
            cars[i].printInfo(false);
            cars[i].start();
            System.out.println("=============================");
        }
    }
}
