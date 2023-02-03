package transport;

public class Car extends Transport <DriverB>{
    private Type type;

    public Car(String brand, String model, double engineVolume1, DriverB driver,Type type,Mechanic mechanic) {
        super(brand, model, engineVolume1, driver,mechanic);
        this.type = type;
    }

    @Override
    public void startMove(){
        System.out.println("Автомобиль марки " + getBrand() + "начал движение");
    }
    @Override
    public void finishMove(){
        System.out.println("Автомобиль марки " + getBrand() + "закончил движение");
    }
    @Override
    public void printType(){
        if (type == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
    @Override
    public void goDiagnostics() {
        System.out.println("Машины проходят диагностику");
    }
    @Override
    public void pitstop(){
        System.out.println("Пит-стоп автомобиля");
    }
    @Override
    public void theBestCircleTime(){
        int minBound = 160;
        int maxBound = 220;
        int theBestTimeInMins = (int)(minBound + (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время автомобиля на круге в минутах" + theBestTimeInMins);
    }
    @Override
    public void maxSpeed(){
        int minBound = 90;
        int maxBound = 140;
        int maxSpeed = (int)(minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость автомобиля" + maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                '}';
    }
}
