public class task02 {

    static void drawRectangle(int x, int y) {
        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

//        Задание 2
//        Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
//        Аргументы функции: ширина прямоугольника в символах, высота прямоугольника в символах
//
//        Например 3 на 2
//        Вывод программы:
//        + + +
//        + + +

        drawRectangle(3,2);

    }
}
