import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            DriverB driverB = new DriverB("Driver cat.B №" + i, true, 5 + i);
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.6,
                    driverB,
                    Type.SEDAN,
                    new Mechanic("Арбузиков", "Yandex Taxi")

            );
            DriverC driverC = new DriverC("Driver cat.C №" + i, true, 5 + i);
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    2.4,
                    driverC,
                    LoadCapacity.getValue(50),
                    new Mechanic("Рябчиков", "Get Taxi")


            );
            DriverD driverD = new DriverD("Driver cat.D №" + i, true, 5 + i);
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    3.0,
                    driverD,
                    Size.getValue(60),
                    new Mechanic("Михалыч", "ГРУЗОВИЧКОФФ")

            );
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
            car.toString();
            car.goDiagnostics();
            truck.goDiagnostics();
            //           bus.goDiagnostics();
            try {
                throw new TransportTypeException("Этот вид транспортного средства диагностику проходить не должен!");
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }

        }
        DriverD driverD1 = new DriverD("Автобусиков", true, 5);
        DriverD driverD2 = new DriverD("Камчаткин", false, 9);
        DriverB driverB1 = new DriverB("Михалыч", true, 5);
        DriverB driverB2 = new DriverB("Алексеев", true, 6);
        DriverC driverC1 = new DriverC("Рябчиков", true, 8);
        DriverC driverC2 = new DriverC("Арбузик", false, 6);


        Mechanic mechanic1 = new Mechanic("Арбузиков", "Yandex Taxi");
        Mechanic mechanic2 = new Mechanic("Рябчиков", "Get Taxi");
        Mechanic mechanic3 = new Mechanic("Михалыч", "ГРУЗОВИЧКОФФ");

        Transport bus1 = new Bus("bus1", "bus1", 6.0, driverD1, Size.MIDDLE, mechanic1);
        Transport bus2 = new Bus("bus2", "bus2", 7.4, driverD2, Size.SUPER_BIG, mechanic1);
        Transport сar1 = new Car("car1", "car1", 3.5, driverB1, Type.CROSSOVER, mechanic2);
        Transport car2 = new Car("car2", "car2", 2.6, driverB2, Type.SEDAN, mechanic2);
        Transport truck1 = new Truck("truck1", "truck1", 6.0, driverC1, LoadCapacity.N2, mechanic3);
        Transport truck2 = new Truck("truck2", "truck2", 5.8, driverC2, LoadCapacity.N1, mechanic3);


        List<Transport> racers = new ArrayList<>();
        racers.add(bus1);
        racers.add(bus2);
        racers.add(сar1);
        racers.add(car2);
        racers.add(truck1);
        racers.add(truck2);
        for (Transport transport : racers) {
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanic());
        }



    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " Б и будет учавствовать в заезде");
    }
}