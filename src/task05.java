public class task05 {

    static void counter(int x) {

        if (x > 0) {
            counter(x - 1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

//        Задание 5
//        Решить задачу 1, без использования циклов. Используя рекурсию.
//
//        Задание 1
//        Написать функцию которая считает в консоли до числа Х.
//        Аргументы функции: число Х
//
//        Например Х = 5.
//        Вывод программы:
//        1
//        2
//        3
//        4
//        5

        int X = 5;
        counter(X);

    }
}
