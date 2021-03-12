package Lesson3;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {

        // Размер доски (работает любой размер)
        int n = 5;

        Scanner in = new Scanner(System.in);

        // Имена игроков

        System.out.print("Игрок 1, Как тебя зовут? ");
        String p1 = in.nextLine();
        System.out.print("Игрок 2, Как тебя зовут? ");
        String p2 = in.nextLine();

        // Доска nхn
        // _ пустые клетки
        // Х Игрок1
        // О Игрок2
        char[][] board = new char[n][n];

        // заполнение поля

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '_';
            }
        }

        // Отслеживание хода
        boolean isPlayer1 = true;

        // Отслеживание конца игры
        boolean gameEnded = false;

        while (!gameEnded) {
            // Рисуем доску
            drawBoard(board);

            // Отслеживаем какой символ мы используем для игры
            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

            // Объявляем ходы игроков
            if (isPlayer1) {
                System.out.println(p1 + " Ходит (X):");
            } else {
                System.out.println(p2 + " Ходит (O):");
            }

            // Переменные строк и столбцов
            int row = 0;
            int col = 0;

            while (true) {
                // Столбцы и строки от пользователя
                System.out.print("Введите номер строки: ");
                row = in.nextInt();
                System.out.print("Введите номер столбца: ");
                col = in.nextInt();

                // Проверка валидности хода
                if (row < 0 || col < 0 || row >= n || col >= n) {
                    // Вылет за пределы поля
                    System.out.println("Нельзя ходить за пределы поля!");
                } else if (board[row][col] != '_') {
                    // Клетка занята
                    System.out.println("Кто-то уже ходил сюда!");
                } else {
                    // Клетка свободна
                    break;
                }
            }

            // Установим позицию символа игрока
            board[row][col] = symbol;

            // Проверим выиграл ли игрок
            if (hasWon(board) == 'X') {
                // Выиграл Игрок 1
                System.out.println(p1 + " выиграл!");
                gameEnded = true;
            } else if (hasWon(board) == 'O') {
                // Выиграл Игрок 2
                System.out.println(p2 + " выиграл!");
                gameEnded = true;
            } else {
                // Если ничья
                if (hasTied(board)) {
                    //Ничья
                    System.out.println("Ничя!");
                    gameEnded = true;
                } else {
                    // Продолжить игру и переключить ход
                    isPlayer1 = !isPlayer1;
                }
            }
        }

        // Вывод текущего состояния доски
        drawBoard(board);

    }

    // Рисуем доску
    public static void drawBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static char hasWon(char[][] board) {
        // Строка
        /*for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_') {
                return board[i][0];
            }
        }
        */
        for (int i = 0; i < board.length; i++) {
            boolean inARow = true;
            char value = board[i][0];
            if (value == '_') {
                inARow = false;
            } else {
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] != value) {
                        inARow = false;
                        break;
                    }
                }
            }
            if (inARow) {
                return value;
            }
        }
        // Столбец
        /*for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '_') {
                return board[0][j];
            }
        }
        */
        for (int j = 0; j < board[0].length; j++) {
            boolean inACol = true;
            char value = board[0][j];
            if (value == '_') {
                inACol = false;
            } else {
                for (int i = 1; i < board.length; j++) {
                    if (board[i][j] != value) {
                        inACol = false;
                        break;
                    }
                }
            }
            if (inACol) {
                return value;
            }
        }
        // Диагонали
        /*if (board[0][0] == board ==[1][1] &&board[1][1] == board[2][2] && board[0][0] != '_'){
            return board[0][0];
        }
        if (board[2][0] == board ==[1][1] &&board[1][1] == board[0][2] && board[2][0] != '_'){
            return board[2][0];

        }
        */
        // Первая диагональ
        boolean inD1 = true;
        char value1 = board[0][0];
        if (value1 == '_') {
        } else {
            for (int i = 0; i < board.length; i++) {
                if (board[i][i] != value1){
                    inD1 = false;
                    break;
                }
            }
            if (inD1) {
                return value1;
            }
        }

        // Вторая диагональ
        boolean inD2 = true;
        char value2 = board[0][board[0].length - 1];
        if (value2 == '_') {
            inD2 = false;
        } else {
            for (int i = 1; i < board.length; i++) {
                if (board[i][board[0].length - 1 - i] != value2) {
                    inD2 = false;
                    break;
                }
            }
        }
        if (inD2) {
            return value2;
        }
        // Никто не выиграл
        return '_';

    }

    // Проверка заполнения поля
    public static boolean hasTied(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}