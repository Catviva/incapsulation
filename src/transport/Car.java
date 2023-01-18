package transport;

import java.util.regex.Pattern;

import static transport.CheckUtility.*;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String carBody;
    private String carNumber;
    private final int quantityOfSeats;
    private boolean winterTires;
    private Key key;



    public Car(String brand, String model,
               int year, String country, String color,int maxSpeed,
               double engineVolume, String transmission,
               String carBody, String carNumber, int quantityOfSeats,
               boolean winterTires,
               Key key) {
        super(brand, model, year, country,color, maxSpeed);
        this.engineVolume = CheckUtility.checkEngineVolume(engineVolume);
        this.transmission = checkTransmission(transmission);
        this.carBody = checkCarBody(carBody);
        this.carNumber = checkCarNumber(carNumber);
        this.quantityOfSeats = quantityOfSeats <= 0 ? 5 : quantityOfSeats;
        this.winterTires = winterTires;
        setKey(key);

    }
    public static class Key {
        public Key(boolean remoteStart, boolean freeAccess) {
        this.remoteStart = remoteStart;
        this.freeAccess = freeAccess;
    }
        private final boolean remoteStart;
        private final boolean freeAccess;

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isFreeAccess() {
            return freeAccess;
        }

        @Override
        public String toString() {
            return (remoteStart ? "Удааленный запуск двигателя":"Без удаленного запуска") + ", " +
                    (freeAccess ? "Бесключевой доступ":"Доступ с ключом");
        }

    }

    public void changeTyres(int month){
        if ((month >=11 || month <= 12) || (month>=1||month<=3)) {
            winterTires = true;
        }
        if (month >=4 || month <= 10) {
            winterTires = false;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public String getCarBody() {
        return carBody;
    }

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }
    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null){
            key = new Key (false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                engineVolume + ", " +
                transmission + ", " +
                carBody + ", " +
                carNumber + ", " +
                quantityOfSeats + ", " +
                winterTires + ", " +
                key + ".";
    }

}