package ru.gb.shavshina;
/*1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов,
при условии что подали на вход корректный массив).
Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
Integer.parseInt(сюда_подать_строку);*/

public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"8", "6", "2", "1"},
                {"0", "4", "0", "2"},
                {"9", "3", "5", "1"},
                {"0", "9", "5", "6"}
        };
        String[][] wrongSizeMatrix = {
                {"2", "3", "9", "6"},
                {"4", "4", "3", "3"},
                {"8", "7", "1", "2"},
                {"7", "1"}
        };
        String[][] wrongCharMatrix = {
                {"1", "7", "3", "5"},
                {"m", "2", "3", "5"},
                {"2", "4", "5", "6"},
                {"1", "7", "4", "6"}
        };

        try {
            System.out.println("Вариант 1:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println("Вариант 2:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3:");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}


