package transport;

public class Bus extends Transport <DriverD>{

    public Bus(String brand, String model, double engineVolume1, DriverD driver) {
        super(brand, model, engineVolume1, driver);
    }

    @Override
    public void startMove(){
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Автобус марки " + getBrand() + "закончил движение");
    }
    @Override
    public void pitstop(){
        System.out.println("Пит-стоп автобуса");
    }
    @Override
    public void theBestCircleTime(){
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMins = (int)(minBound + (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время автобуса на круге в минутах" + theBestTimeInMins);
    }
    @Override
    public void maxSpeed(){
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость автобуса" + maxSpeed);
    }

}
