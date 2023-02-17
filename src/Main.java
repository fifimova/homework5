public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Проверьте введёные данные");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2010;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        var year = 2000;
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 !=0)){
            System.out.println(year + " високосный год");
        }else {
            System.out.println(year + " не вискосный год");
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
    int deliveryDistance = 40;
    if (deliveryDistance < 20){
        System.out.println("Потребуется дней: 1");
    }else if (deliveryDistance >= 20 && deliveryDistance<60){
        System.out.println("Потребуется дней: 2");
    }else if ( deliveryDistance >= 60 && deliveryDistance <100){
        System.out.println("Потребуется дней: 3");
    }else {
        System.out.println("Доставки нет");
    }
    }
    public static void task5(){
        System.out.println("Задание 5");
        int monthNumber = 13;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима, вперед лепить снеговики!!!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна, снимай шапку и за подснежниками :)");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето, время ночных тусовок!!!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень, вперед собирать гербарий и учить уроки...");
                break;
            default:
                System.out.println("Открой календарь и посчитай месяцы");
        }
    }
}
