import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            Mechanic mechanic7 = new Mechanic("Ждун", "Yandex Taxi");
            Mechanic mechanic8 = new Mechanic("Кпустянка", "Get Taxi");
            Mechanic mechanic9 = new Mechanic("Пчёлка", "ГРУЗОВИЧКОФФ");

            List<Mechanic> mechanics = new ArrayList<>();
            mechanics.add(mechanic7);
            mechanics.add(mechanic8);
            mechanics.add(mechanic9);
            DriverB driverB = new DriverB("Driver cat.B №" + i, true, 5 + i);
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.6,
                    driverB,
                    Type.SEDAN,
                    mechanics

            );
            DriverC driverC = new DriverC("Driver cat.C №" + i, true, 5 + i);
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    2.4,
                    driverC,
                    LoadCapacity.getValue(50),
                    mechanics


            );
            DriverD driverD = new DriverD("Driver cat.D №" + i, true, 5 + i);
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    3.0,
                    driverD,
                    Size.getValue(60),
                    mechanics



            );
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
            car.toString();
            try {
                truck.goDiagnostics();
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }
            try {
                car.goDiagnostics();
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }
            try {
                bus.goDiagnostics();
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

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        for (Mechanic mechanic : mechanics){
            System.out.println(mechanic);
        }

        Transport bus1 = new Bus("bus1", "bus1", 6.0, driverD1, Size.MIDDLE,mechanics);
        Transport bus2 = new Bus("bus2", "bus2", 7.4, driverD2, Size.SUPER_BIG,mechanics);
        Transport сar1 = new Car("car1", "car1", 3.5, driverB1, Type.CROSSOVER,mechanics);
        Transport car2 = new Car("car2", "car2", 2.6, driverB2, Type.SEDAN,mechanics);
        Transport truck1 = new Truck("truck1", "truck1", 6.0, driverC1, LoadCapacity.N2,mechanics);
        Transport truck2 = new Truck("truck2", "truck2", 5.8, driverC2, LoadCapacity.N1,mechanics);


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
        mechanic1.maintenance();
        mechanic2.carRepairs();

        Queue<Object> vehicle = new LinkedList<>();
        vehicle.add(bus1);
        vehicle.add(bus2);
        vehicle.add(сar1);
        vehicle.add(car2);
        vehicle.add(truck1);
        vehicle.add(truck2);
        System.out.println(vehicle);

        Map<Object, List<Mechanic>> carAndMechanics = new HashMap<>();
        carAndMechanics.put(сar1,mechanics);
        carAndMechanics.put(car2,mechanics);
        System.out.println(carAndMechanics);

        for (Map.Entry<Object,List<Mechanic>> entry : carAndMechanics.entrySet()){
            System.out.println("Ключ : " + entry.getKey() + " Значение : " + entry.getValue());
        }





    }


    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + "  и будет учавствовать в заезде");
    }
}