import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
     // метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
                int a= sc.nextInt();
        if (a >= 0) {
             System.out.println("Введенное число" + " " +"положительное.");
             } else {
              System.out.println("Введенное число" + " " + "отрицательное.");
                    }
        System.out.println( ); // пробел между заданиями

        System.out.println(methodSum10From20( 5, 9 )); // метод, принимающий на вход два целых числа

        System.out.println( ); // пробел между заданиями

        System.out.println(isPositive(15)); // метод, которому в качестве параметра передается целое число

        System.out.println( ); // пробел между заданиями


        // метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
        String st = "Orange";
        for ( int i= 0; i < 8; i++){
            System.out.println(st);
        }
        System.out.println( );

// метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("Введите год в формате ГГГГ:");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y%4==0 && y%100!=0 || y%400==0){
            System.out.println( y + "- " + "Високосный год");
        } else {
            System.out.println( y + "- " + "Не високосный год");
        }
    }
// метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean methodSum10From20(int a, int b) {
        int sum = a + b ;
        if (sum <= 20 && sum >=10) {
            return true;
        } else {
            return false;
        }
    }

    // метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное

    public static boolean isPositive ( int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
}



