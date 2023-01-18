package transport;
import static transport.CheckUtility.*;

public class Transport {

    public String brand;
    public String model;
    public final int year;
    public final String country;
    public String color;
    public int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.year = checkYear(year);
        this.country = checkCountry(country);
        this.color = checkColor(color);
        this.maxSpeed = checkMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;

    }

    @Override
    public String toString() {
        return brand + ", " +
                model + ", " +
                year + ", " +
                country + ", " +
                color + ", " +
                maxSpeed + ", ";
    }

    public void print() {
        System.out.println(this);
    }

}
