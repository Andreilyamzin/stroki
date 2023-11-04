public class metod {
    public static void main(String[] args) {
        isLeapYear(2000);
        isLeapYear(5841);
        isLeapYear(68652);
        isLeapYear(845688);


        print(1, 2014);
        print(0, 2020);


        var days = deliveryTime(50);
        if (days == -1){
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней " + days);
        }

    }

    private static void isLeapYear(int year) {

        if ((year % 400 == 0 || year % 4 == 0 && year % 100 != 0) && year > 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void print(int OS, int clientDeviseYear) {

        if (OS == 1 && clientDeviseYear <= 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (OS == 0 && clientDeviseYear <= 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (OS == 1 && clientDeviseYear > 2015) {
            System.out.println("Установитe для iOS по ссылке");
        } else if (OS == 0 && clientDeviseYear > 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Проверьте еще раз");
        }
    }

    private static int deliveryTime(int deliveryDistanse) {
        if (deliveryDistanse > 100) {
            return -1;
        } else {
            int days = 1;
            if (deliveryDistanse > 20) {
                days++;
            }
            if (deliveryDistanse > 60) {
                days++;
            }
            return days;
        }
    }

}