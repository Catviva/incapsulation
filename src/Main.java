
import transport.Car;

public class Main {
        public static void main(String[] args) {

            Car car1 = new Car("", "Granta", 0, "Желтый",
                    2015, "Россия", "Автомат",
                    "Седан", "А777АА36", 5, true);
            Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                    "Черный", 2020, "Германия", null,
                    "Купе", "М888ММ77", 5, false);
            Car car3 = new Car("BMW", "", 3.0, "",
                    2021, "Германия", "Автомат",
                    "SUV", "В342ВВ54", 7, true);
            Car car4 = new Car(null, "Sportage 4-го поколения", 2.4,
                    "Красный", 2018, null, "Ручная",
                    "SUV", "У555УУ22", 6, true);
            Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
                    0, "Южная Корея", "Автомат",
                    "Седан", "Р676Р/42", 0, false);

            car1.print();
            car2.print();
            car3.print();
            car4.print();
            car5.print();

            car2.open();
            car2.start();


        }


    }