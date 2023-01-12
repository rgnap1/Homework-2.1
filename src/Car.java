import java.util.Objects;

public class Car {
   private String brand;
   private String model;
   private double engineVolume;
   private String color;
   private int year;
   private String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = (brand == null || brand == "" ? "default" : brand);
        this.model = (model == null || model == "" ? "default" : model);
        this.engineVolume = (engineVolume < 0 || engineVolume == 0 ? 1.5 : engineVolume);
        this.color = (color == null || color == "" ? "белый" : color);
        this.year = (year < 0 || year == 0 ? 2000 : year);
        this.country = (country == null || country == "" ? "default" : country);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getEngineVolume(), getEngineVolume()) == 0 && getYear() == car.getYear() && getBrand().equals(car.getBrand()) && getModel().equals(car.getModel()) && getColor().equals(car.getColor()) && getCountry().equals(car.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume(), getColor(), getYear(), getCountry());
    }
}
