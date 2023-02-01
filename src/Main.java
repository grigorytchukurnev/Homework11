import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isYearLeap(2024);


        determineOSVersion(0,2015);
        determineOSVersion(0,2023);


        int time1 = calculateTime( 15);
        int time2 = calculateTime( 50);
        int time3 = calculateTime( 100);
        int time4 = calculateTime( 140);


    }



    public static void isYearLeap(int year){
        System.out.println("Задача1");
        if (year%4 ==0 && year%100!=0 || year%400==0){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }



    public static void determineOSVersion( int clientDeviceYear, int deviceYear) {
        System.out.println("Задача2");

        int currentYear = LocalDate.now().getYear();
        if(clientDeviceYear == 0) {

            if (deviceYear == currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (deviceYear == currentYear) {
                System.out.println("Установите облегченную версию приложения для android по ссылке");
            } else {
                System.out.println("Установите версию приложения для android по ссылке.");
            }
        }
    }
    public static int calculateTime (int deliveryDistance) {
        System.out.println("Задача3");{

            if (deliveryDistance <= 20) {

                System.out.println("Потребуется 1 день доставки.");
            } else {
                if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    System.out.println("Потребуется 2 дня доставки.");
                }
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется 3 дня доставки.");
                } else if (deliveryDistance > 100) {
                    System.out.println("Доставка не осуществляется");
                }
            }return deliveryDistance;
        }
    }
}