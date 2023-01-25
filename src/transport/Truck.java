package transport;

public class Truck extends Transport<DriverC>{

    public Truck(String brand, String model, double engineVolume1, DriverC driver) {
        super(brand, model, engineVolume1, driver);
    }

    @Override
    public void startMove(){
        System.out.println("Грузовик марки " + getBrand() + "начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Грузовик марки " + getBrand() + "закончил движение");
    }
    @Override
    public void pitstop(){
        System.out.println("Пит-стоп грузовика");
    }
    @Override
    public void theBestCircleTime(){
        int minBound = 80;
        int maxBound = 100;
        int theBestTimeInMins = (int)(minBound + (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время агрузовика на круге в минутах" + theBestTimeInMins);
    }
    @Override
    public void maxSpeed(){
        int minBound = 30;
        int maxBound = 60;
        int maxSpeed = (int)(minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость грузовика" + maxSpeed);
    }


}
