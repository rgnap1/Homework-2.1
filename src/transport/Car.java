package transport;
import java.util.Objects;
import java.time.LocalDate;
public class Car extends Transport {
   private double engineVolume;
   private String color;
   private String transmission;
   private final String bodyType;
   private int registrationNumber;
   private final int numberOfSeats;
   private boolean rubberWinter;
   private Key key;

    public Car(String brand, String model, double engineVolume, String color, int maxSpeed, String transmission, String bodyType, int year, String country, String bodyColor, int registrationNumber, int numberOfSeats, boolean rubberWinter,boolean remoteEngineStart, boolean keylessEntry){
        super(brand,model,year,country,bodyColor,maxSpeed);
        this.engineVolume = (engineVolume < 0 || engineVolume == 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isBlank() ? "белый" : color);
        this.transmission = (transmission == null || transmission.isBlank() ? "default" : transmission);
        this.bodyType = (bodyType == null || bodyType.isBlank() ? "default" : bodyType);
        this.registrationNumber = (registrationNumber <= 0 ? 1111111111 : registrationNumber);
        this.numberOfSeats = (numberOfSeats <= 0 ? 4 : numberOfSeats);
        this.rubberWinter = rubberWinter;
        key = new Key(remoteEngineStart, keylessEntry);
    }

    private class Key{
        final private boolean remoteEngineStart;
        final private boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public boolean getRubberWinter() {
        return rubberWinter;
    }
    public void setRubberWinter(boolean rubber) {
        this.rubberWinter = rubberWinter;
    }

    public void changeRubber(){
        int mounth = LocalDate.now().getDayOfMonth();
        rubberWinter = mounth < 4 || mounth > 9;
    }


    @Override
    public String toString() {
        return super.toString()+ ", " +
                "Car{" +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", rubberWinter=" + (rubberWinter ? "Winter rubber" : "Summer rubber") +
                ", remoteEngineStart=" + key.remoteEngineStart +
                ", keylessEntry=" + key.keylessEntry +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getEngineVolume(), getEngineVolume()) == 0 && getRegistrationNumber() == car.getRegistrationNumber() && getNumberOfSeats() == car.getNumberOfSeats() && getRubberWinter() == car.getRubberWinter() &&  getColor().equals(car.getColor()) && getTransmission().equals(car.getTransmission()) && getBodyType().equals(car.getBodyType());
    }

    @Override
    public int hashCode() {
        return super.hashCode() +  Objects.hash( getEngineVolume(), getColor(), getTransmission(), getBodyType(), getRegistrationNumber(), getNumberOfSeats(), getRubberWinter());
    }
}
