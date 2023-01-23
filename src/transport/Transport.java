package transport;

import java.util.Objects;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String bodyColor, int maxSpeed) {
        this.brand = (brand == null || brand.isBlank() ? "default" : brand);
        this.model = (model == null || model.isBlank() ? "default" : model);
        this.year = (year < 0 || year == 0 ? 2000 : year);
        this.country = (country == null || country.isBlank() ? "default" : country);
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = (bodyColor == null || bodyColor.isBlank() ? "белый" : bodyColor);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed<=0){
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return getYear() == transport.getYear() && getMaxSpeed() == transport.getMaxSpeed() && getBrand().equals(transport.getBrand()) && getModel().equals(transport.getModel()) && getCountry().equals(transport.getCountry()) && getBodyColor().equals(transport.getBodyColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getYear(), getCountry(), getBodyColor(), getMaxSpeed());
    }
}
