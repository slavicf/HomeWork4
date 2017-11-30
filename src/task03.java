public class task03 {

    static void drawRectangle(int x) {
        drawRectangle(x, x);
    }

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

        drawRectangle(2);

        drawRectangle(3);
    }

}
