package Lesson2;

import java.util.Arrays;

public class HW2 {

        public static void main(String[] args) {
                /*
                 * Задание 1. Создать массив изэлементов 0 и 1.
                 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
                 */

                int[] MyOne = {0, 1, 1, 0, 1, 0, 0, 1};
                System.out.println("1. Before:\t" + Arrays.toString(MyOne));
                change(MyOne);
                System.out.println("1. After:\t" + Arrays.toString(MyOne));
                System.out.println(MyOne);


                /*
                 *  2. Задать пустой целочисленный массив размером 8.
                 * Написать метод, который c помощью цикла заполнит его значениями
                 * 1 4 7 10 13 16 19 22;
                 */

                int[] arrTwo = new int[8];
                fillIn(arrTwo);
                System.out.println("2. Filled with cycle:\t" + Arrays.toString(arrTwo));

                /*
                 * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ];
                 * написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2.
                 */
                int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                System.out.println("3. Before:\t" + Arrays.toString(arrThree));
                doubling(arrThree);
                System.out.println("3. After:\t" + Arrays.toString(arrThree));


                /*
                 * 4 Задать одномерный массив.
                 *  Написать методы поиска в нём минимального и максимального элемента;
                 */

                int[] arrFour = {2, 7, 5, 4, 9, 1, 6, 5,};
                System.out.println("4. Min Value:" + findMin(arrFour));
                System.out.println("4. Max Value:" + findMax(arrFour));

                /*
                 * 5* Создать квадратный целочисленный массив
                 * (количество строк и столбцов одинаковое),
                 * заполнить его диагональные элементы единицами, используя цикл(ы);
                 */

                int[][] table = new int[5][5];

                crossFill(table);
                for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table.length; j++) {
                            System.out.print(table[i][j] + " ");

                        }
                        System.out.println();
                }

                /* Пока не осилил, но разберусь
                 * 6. Написать метод,
                 * которому на вход подаёнытся одномерйи число массив  n (может быть положительным, или отрицательным),
                 * при этом метод должен циклически сместить все элементы массива на n позиций.
                 * [1,2,3,4,5], -2 => [3,4,5,1,2]
                 * [1,2,3,4,5], 2 => [4,5,1,2,3]
                 */

                 int[] maroon = {1, 2, 3, 4, 5};
                 System.out.println("6. Before:\t" + Arrays.toString(maroon));
                 myMove(maroon, 2);
                 System.out.println("6. After:\t" + Arrays.toString(maroon));

        }



        public static void change (int[] array) {
        /*  array[i] = (array[i] == 1) ? 0 : 1; //Короткая запись понравилась, решил себе сохранить.
         *  array[i] = 1 - array[i];
        */
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) array[i] = 1;
                else array[i] = 0;
            }
        }


        public static void fillIn (int[] array) {
            array[0] = 1;
            for (int i = 1; i < array.length; i++) {
                //array[i] = i * 3 + 1;
                array[i] = array[i - 1] + 3;
            }
        }

        public static void doubling (int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] = array[i] * 2;
                }
            }

        }
        public static int findMin (int[] arrFour) {
            int minV = arrFour[0];
            for (int i = 1; i < arrFour.length; i++) {
                if (arrFour[i] < minV) {
                    minV = i;
                }
            }
            return minV;
        }

        /*
            // Ради интереса попробовал и здесь сортировку
        Arrays.sort(arrFour);
        return arrFour[0];
        */


        public static int findMax(int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
            // Здесь можно было тоже циклом как в findMin, но сортировка мне понравилась
        }

        // Прикольный метод, запомню.
        public static void crossFill(int[][] cross) {
            /*for (int i = 0; i < arr.length; i++) {
            *      arr[i][i] = 1;
            *      arr[i][arr.length - 1 - i] = 1;
            * }
            */
            int j = 0;
            for (int i = 0; i < 5; i++) {
                    cross[i][j] = 1;
                    cross[i][cross.length - 1 - j] = 1;
                    j++;
            }
        }

        public static void myMove(int[] array, int n) {

           /*
            int tmp = array[array.length-1];
            for (int i = array.length - 1; i > 0 ; --i) {
                array[i] = array[i - 1];
                array[0] = tmp;
            }
            */

            int tmp = array[0];
            for (int i = 0; i < array.length - 1; ++i) {
                array[i] = array[i + 1];
                array[4] = tmp;
            }

        }

}
