package transport;

import java.util.Objects;

public abstract class Transport <T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume1;
    private T driver;


    public Transport(String brand, String model, double engineVolume1, T driver) {
        this.brand = (brand == null || brand.isBlank() ? "default" : brand);
        this.model = (model == null || model.isBlank() ? "default" : model);
        this.engineVolume1 = (engineVolume1  < 0 || engineVolume1 == 0 ? 3 : engineVolume1);
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume1() {
        return engineVolume1;
    }
    public void setEngineVolume1(double engineVolume1) {
        this.engineVolume1 = engineVolume1;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void printType();
    public static boolean passedDiagnostic(){
        System.out.println("Пройти диагностику!");
        return false;
    }
    public abstract boolean goDiagnostics() throws  TransportTypeException;

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume1(), getEngineVolume1()) == 0 && getBrand().equals(transport.getBrand()) && getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume1());
    }
}
