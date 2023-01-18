package transport;

import java.util.regex.Pattern;

public class CheckUtility {


    public static String checkBrand(String brand) {

        return (brand == null || brand.isEmpty()) ? "default" : brand;
    }

    public static String checkModel(String model) {

        return (model == null || model.isEmpty()) ? "default" : model;
    }

    public static double checkEngineVolume(double engineVolume) {
        if (engineVolume <= 0)
            return 1.5;
        return engineVolume;
    }

    public static String checkColor(String color) {
        return (color == null || color.isEmpty()) ? "Белый" : color;

    }

    public static int checkYear(int year) {
        if (year <= 0)
            return 2000;
        return year;
    }

    public static String checkCountry(String country) {
        return (country == null || country.isEmpty()) ? "default" : country;
    }

    public static String checkTransmission(String transmission) {
        return (transmission == null || transmission.isEmpty() || transmission == "Ручная") ? "MКП" : transmission;

    }

    public static String checkCarBody(String carBody) {
        return (carBody == null || carBody.isEmpty()) ? "default" : carBody;
    }

    public static int checkMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) {
            System.out.println("default");
        }
        return maxSpeed;
    }

    public static String checkCarNumber(String carNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{2}", carNumber)) {
            return carNumber;
        } else {
            return "Номер некорректный";
        }
    }
}


