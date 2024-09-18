public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        int clientOS = 1; // IOS 0 | Android 1

        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1)
            System.out.println("Установите версию приложения для Andrioid по ссылке");


// Задание 2


        int clientDeviceYear = 2024;


        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }


// Задание 3

        int year = 1587;
        if (year < 1584) {
            System.out.println("Отсчёт от 1584 года");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");

// Задание 4


        int deliveryDistance = 95;

        if (deliveryDistance < 20)
            System.out.println("На дсотавку потребуется 1 день");

        else if (deliveryDistance <= 60) {
            System.out.println("На доставку потребуется 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("На доставку потребуется 3 дня");
        } else System.out.println("Нет доставки");

// Задание 5

        int monthNumber = 13;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");}



    }
}



