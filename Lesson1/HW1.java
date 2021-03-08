package Lesson1;

public class HW1 {

    public static void main(String[] args) {

        HW1 lesson1 = new HW1();

        //Закоментированный sout сделал для себя, чтобы видеть что происходит на выходе
        //System.out.println(lesson1.dot_one(4,7,15,3));
        //System.out.println(lesson1.gipsy(2, 7));
        //System.out.println(lesson1.gipsy(4,8));
        lesson1.tongue(2);
        lesson1.tongue(-2);
        lesson1.hello("Андрей");
        lesson1.calendar1(2020);
        lesson1.calendar1(2021);
    }

    // Задача 1.
    public float dot_one (int a, int b, int c, int d) {

        float f = a * (b + (c / d));
        return f;
    }

    // Задача 2.
    public boolean gipsy (int a, int b) {

        int sum = a+b;
        if (sum <= 20 && sum >= 10)
        {
            return true;
        }
        else {
            return false;
        }
    }

    // Задача 3. Ничего не возвращаем, просто печатаем в консоль
    public void tongue(int c) {
        if (c >= 0){
            System.out.println("Pos");
        }
        else {
            System.out.println("Neg");
        }
    }

    // Задача 4. Ничего не возвращаем, просто печатаем в консоль
    public void hello(String name) {

        System.out.println("Привет, " + name + "!");
    }

    //Задача 5. Про високосный год
    public void  calendar1(int y) {

        // Если год делится на 400, то год високосный, если делится на 4, то проверяем делится ли он на 100,
        // если делится то год не високосный.
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
            System.out.println("Високосный");
        }

        else {
            System.out.println("Не високосный");
        }
    }

}
