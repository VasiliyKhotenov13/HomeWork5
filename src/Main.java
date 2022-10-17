public class Main {
    public static void main(String[] args) {

        //задание 1 и 2
        System.out.println("Задание 1 и 2!");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке!");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке!");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке!");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке!");
            }
        }
        //задание 3
        System.out.println("Задание 3!");
        int year = 2023;
        boolean isLeapYear = year % 4 == 0;
        if ((isLeapYear && year % 100 != 0) || (year % 400 == 0))  {
            System.out.println("Это високосный год!");
        } else {
            System.out.println("Этот год не високосный!");
        }

        //задание 4
        System.out.println("Задание 4!");
        int deliveryDistance = 95;
        int deliveryDate = 1;

        if (deliveryDistance > 20) {
            deliveryDate = deliveryDate + 1;
        }
        if (deliveryDistance >= 60 && deliveryDistance <=100) {
            deliveryDate = deliveryDate + 1;
        }
        System.out.println("Время доставки " + deliveryDate+ "!");

        //задание 5
        System.out.println("Задание 5!");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Этот месяц пренадлежит к сезону ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц пренадлежит к сезону ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц пренадлежит к сезону ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц пренадлежит к сезону ОСЕНЬ");
                break;
            case 12:
                System.out.println("Этот месяц пренадлежит к сезону ЗИМА");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }

    }
}