import transport.Car;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta",1.7,"желтый",2015,"Россия","Автомат","тип кузова",23,4,true,true,true);
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия","автомат","тип кузова",145,6,true,true,true);
        Car car3 = new Car("BMW","Z8",3.0,"черный",2021,"Германия","автомат","тип кузова",856,4,true,true,true);
        Car car4 = new Car("KIA","Sportage 4",2.4,"красный",2018,"Южная Корея","автомат","тип кузова",77,4,true,true,true);
        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея","механика","тип кузова",7894,4,false,true,true);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());







    }
}