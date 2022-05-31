package ru.gb.shavshina;

class MyArraySizeException extends CustomException {

    MyArraySizeException() {
        super("Размер массива должен быть [4 x 4]\n");
    }
}