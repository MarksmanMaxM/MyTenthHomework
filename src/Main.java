import java.time.Instant;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Задание 1
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        year(year);

//        Задаине 2
        boolean iOs = true;
        install(iOs);

//        Задание 3
        System.out.println("Введите расстояние до клиента:");
        int deliveryDistance = scanner.nextInt();
        distance(deliveryDistance);


    }

    public static void year(int year) {

        if (year % 4 == 0 && year > 1584 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("Год високосный!");
        else if (year > 1584) System.out.println("Год не високосный!");
        else System.out.println("В это время високосные годы не были введены!");
    }

    public static void install(boolean iOs) {

        if (!iOs) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год производства устройства:");
        int clientDeviceYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();

        String message = clientDeviceYear < currentYear ? "Light" : "";
        String messageOs = iOs ? "iOs" : "Android";
        System.out.printf("Установите версию приложения %s для %s по ссылке \n", message, messageOs);
    }

    public static void distance(int deliveryDistance) {

        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days = 3;
        } else if (deliveryDistance > 100) {
            days = 4;
        }

        System.out.printf("Потребуется %d дней  для доставки \n", Integer.valueOf(days));
    }

}