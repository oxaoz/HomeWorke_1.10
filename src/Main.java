public class Main {
    public static void main(String[] args) {

        // Строки. Задача 1.
        System.out.println("Строки. Задача 1.");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Строки. Задача 2.
        System.out.println("Строки. Задача 2.");

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());


    }
}


