public class task06 {

//        Задание 6
//        Решить задачу 2, без использования циклов. Используя рекурсию.
//  ------------------------------------------------------------
    static void drawRectangle(int x, int y) {
        if (y > 0) {
            row(x);
            System.out.println();
            drawRectangle(x, y - 1);
        }
    }
    //  ------------------------------------------------------------
    static void row(int x) {
        if (x > 0) {
            row(x - 1);
            System.out.print("+ ");
        }
    }
    //  ------------------------------------------------------------
    public static void main(String[] args) {
        drawRectangle(3, 2);
//  ------------------------------------------------------------
    }
}