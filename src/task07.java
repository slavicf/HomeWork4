import java.util.Scanner;

public class task07 {
    //  ------------------------------------------------------------
//        Задание 7 (дополнительно)
//        Написать программу, в которой выполнены все шесть предыдущих заданий.
//        Каждое задание выполняется в отдельной функции.
//        В пределах этой же функции происходит ввод с консоли необходимых данных.
//        Программа спрашивает у пользователя какую задачу он хочет решить (от 1 до 6).
//        Затем программа вызывает соответствующую функцию для решения этой задачи.
//        По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи.
//        Если да - опять спрашивает какую задачу
//  ------------------------------------------------------------
    static Scanner scanner = new Scanner(System.in);
    static int x, y, a, b, c;
    //  ------------------------------------------------------------
    static void task01() {
        System.out.println("Функция считает в консоли до числа Х");
        System.out.print("Введите X: ");
        x = scanner.nextInt();
        task01.counter(x);
    }
    //  ------------------------------------------------------------
    static void task02() {
        System.out.println("Функция рисует в консоли прямоугольник из символов '+'");
        System.out.print("Введите X: ");
        x = scanner.nextInt();
        System.out.print("Введите Y: ");
        y = scanner.nextInt();
        task02.drawRectangle(x, y);
    }
    //  ------------------------------------------------------------
    static void task03() {
        System.out.println("Функция рисует в консоли квадрат с равными сторонами");
        System.out.print("Введите X: ");
        x = scanner.nextInt();
        task03.drawRectangle(x);
    }
    //  ------------------------------------------------------------
    static void task04() {
        System.out.println("Функция принимает на вход два аргумента в виде чисел, возвращает максимальное из этих двух");
        System.out.print("Введите A: ");
        a = scanner.nextInt();
        System.out.print("Введите B: ");
        b = scanner.nextInt();
        c = task04.getMax(a, b);
        System.out.println(c);
    }
    //  ------------------------------------------------------------
    static void task05() {
        System.out.println("Задача 1, без использования циклов. Используя рекурсию");
        System.out.println("Функция считает в консоли до числа Х");
        System.out.print("Введите X: ");
        x = scanner.nextInt();
        task05.counter(x);
    }
    //  ------------------------------------------------------------
    static void task06() {
        System.out.println("Задача 2, без использования циклов. Используя рекурсию");
        System.out.println("Функция рисует в консоли прямоугольник из символов '+'");
        System.out.print("Введите X: ");
        x = scanner.nextInt();
        System.out.print("Введите Y: ");
        y = scanner.nextInt();
        task06.drawRectangle(x, y);
    }
    //  ------------------------------------------------------------
    public static void main(String[] args) {

        do {
            System.out.print("Какую задачу вы хотите решить (от 1 до 6): ");
            c = scanner.nextInt();
            System.out.println();

            if (c == 1) task01();
            else if (c == 2) task02();
            else if (c == 3) task03();
            else if (c == 4) task04();
            else if (c == 5) task05();
            else if (c == 6) task06();
            else System.out.println("Упс");

            System.out.print("\nХотите продолжить решать задачи? (1 - да, 0 - нет)? ");
            c = scanner.nextInt();
        } while (c != 0);
    }
//  ------------------------------------------------------------
}
