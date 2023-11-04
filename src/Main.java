public class Main{
    public static void main(String[] args) {
        task1(); task2(); task3();
    }

    public static void task1() {

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

    }

    public static void task2() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.println();


        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - "
                + fullNameUpperCase);
        // Второй метод:

        System.out.println();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - "
        + fullName.toUpperCase());

    }
    public static void task3(){

    String fullName = "Иванов Семён Семёнович";

        System.out.println("Данные Ф.И.О. сотрудника "
                + fullName.replace("ё", "е"));

    }
}

