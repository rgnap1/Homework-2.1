package transport;

public class Truck extends Transport<DriverC>{
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume1, DriverC driver,LoadCapacity loadCapacity,Mechanic mechanic) {
        super(brand, model, engineVolume1, driver, mechanic);
        this.loadCapacity = loadCapacity;
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
    public void printType(){
        if (loadCapacity == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void goDiagnostics() {
        System.out.println("Грузовики проходят диагностику");
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
