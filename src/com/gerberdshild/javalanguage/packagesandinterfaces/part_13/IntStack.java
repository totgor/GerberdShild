package com.gerberdshild.javalanguage.packagesandinterfaces.part_13;

public interface IntStack {
    void push(int value);
    int pop();

    //возвращаем заданное колличество элемнтов из стека
    //метод закрытый, доступен только default и private методам интерфейса, больше нигде
    private int[] getElements(int n) {
        int[] temp = new int[n];
        for(int i = 0; i < n; i++) temp[i] = pop();
        return temp;
    }

    default int[] popNElements(int n) {
        return getElements(n); //возвращаем n элементов
    }

    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip); //пропускаем skip элементов
        return getElements(n); //возвращаем n элементов
    }
}
