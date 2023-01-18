
import transport.Bus;
import transport.Car;
import transport.Transport;

public class Main {
        public static void main(String[] args) {

            Car car1 = new Car("Lada", "Granta", 0, "Россия",
                    "Желтый", 120, 1.7,
                    "МКП", "Седан",
                    "А777АА36", 4,
                    true, new Car.Key(false, false));
            Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия",
                    "Черный", 300, 3.0,
                    "Автомат", "Купе", "М888ММ77",
                    5,
                    true, new Car.Key(false, false));
            Car car3 = new Car("BMW", "", 2021, "Германия",
                    "Черный", 0, 3.0,
                    "Автомат", "SUV", "В342ВВ54",
                    7, true, new Car.Key(false, true));
            Car car4 = new Car(null, "Sportage 4-го поколения", 2018,
                    "Южная Корея", "Красный", 250, 2.4,
                    "Ручная", "SUV", "У555УУ22",
                    6, false, new Car.Key(false, true));
            Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея",
                    "Оранжевый", 0, 1.6,
                    "Автомат", "Седвн", "Р676Р/42",
                    5, true, new Car.Key(true, false));
            Bus bus1 = new Bus("Mercedes", "Sprinter", 2022, "Германия",
                    "Белый", 200, 15, "Микроавтобус", "Путь");
            Bus bus2 = new Bus("ПАЗ", "672", 1981, "Россия",
                    "Желтый", 80, 23, "Пассажирский", "Автопарк");

           car1.print();
           car2.print();
           car3.print();
           car4.print();
           car5.print();
           bus1.print();
           bus2.print();


        }



    }