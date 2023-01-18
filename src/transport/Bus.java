package transport;

public class Bus extends Transport {
    public int maxCapacity;
    public String type;
    public String ownerCompany;

    public Bus(String brand, String model, int year,
               String country, String color, int maxSpeed,
               int maxCapacity, String type, String ownerCompany) {
        super(brand, model, year, country, color, maxSpeed);
        this.maxCapacity = maxCapacity;
        this.type = type;
        this.ownerCompany = ownerCompany;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(String ownerCompany) {
        this.ownerCompany = ownerCompany;

    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                maxCapacity + ", " +
                type + ", " +
                ownerCompany + ".";
    }


}
