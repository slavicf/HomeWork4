public class task04 {

    static int getMax(int a, int b){
        return a > b ? a : b;
    }

    static float getMax(float a, float b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {

//        Задание 4
//        Написать функцию getMax которая принимает на вход два аргумента в виде чисел.
//        А возвращает максимальное из этих двух.
//        Также, необходимо перегрузить эту функцию для работы с разными
//        числовыми типами переменных (int, float)

        int a = getMax(2,3);
        System.out.println(a);

        float b = getMax(5.3f, 8.5f);
        System.out.println(b);

    }
}