public class task06 {

//        Задание 6
//        Решить задачу 2, без использования циклов. Используя рекурсию.
//
//        Задание 2
//        Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
//        Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах
//
//        Например 3 на 2
//        Вывод программы:
//        + + +
//        + + +
//
//        Задание 3
//        Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы она могла принимать
//        на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
//
//        Например 2
//        Вывод программы:
//        + +
//        + +
//
//        Например 3
//        Вывод программы:
//        + + +
//        + + +
//        + + +

    static void drawRectangle(int x) {
        drawRectangle(x, x);
    }

    static void drawRectangle(int x, int y) {
        if (y > 0) {
            drawRectangle(x, y - 1);
            row(x);
        } else System.out.println();
    }

    static void row(int x) {
        if (x > 0) {
            row(x - 1);
            System.out.print("+ ");
        } else System.out.println();
    }

    public static void main(String[] args) {

        drawRectangle(3, 2);

        drawRectangle(2);

        drawRectangle(3);

    }
}