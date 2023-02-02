import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            DriverB driverB = new DriverB("Driver cat.B №" + i,true,5 + i);
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.6,
                    driverB,
                    Type.SEDAN

            );
            DriverC driverC = new DriverC("Driver cat.C №" + i, true, 5 + i);
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    2.4,
                    driverC,
                    LoadCapacity.getValue(50)


            );
            DriverD driverD = new DriverD("Driver cat.D №" + i,true,5 + i);
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    3.0,
                    driverD,
                    Size.getValue(60)

            );
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
            car.toString();
            Truck.passedDiagnostic();
            Car.passedDiagnostic();
            bus.goDiagnostics();

        }



    }

    private static void printInfo(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getName()+ " управляет автомобилем " + transport.getBrand()+ " Б и будет учавствовать в заезде");
    }
}