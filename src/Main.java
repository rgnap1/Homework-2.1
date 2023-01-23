import transport.Bus;
import transport.Car;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta",1.7,"желтый",-160,"автомат","тип кузова",2015,"Россия","белый",422,4,false,true,true);
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",160,"автомат","тип кузова",2020,"Германия","белый",8523,4,true,true,true);
        Car car3 = new Car("BMW","Z8",3.0,"черный",160,"автомат","тип кузова",2021,"Германия","черный",865,4,true,true,true);
        Car car4 = new Car("KIA","Sportage 4",2.4,"красный",170,"автомат","тип кузова",2018,"Южная Корея","черный",1111132,4,true,true,true);
        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",220,"механика","тип кузова",2016,"Южная Корея","черный",78523,4,true,true,true);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

        Bus bus1 = new Bus("ВАЗ","А90",160,2015,"Россия","желтый");
        System.out.println(bus1.toString());
        for (int i = 1; i <= 2; i++){
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    180,
                    2020 + i,
                    "Россия",
                    "желтый"
            );
            System.out.println(bus);
        }








    }
}